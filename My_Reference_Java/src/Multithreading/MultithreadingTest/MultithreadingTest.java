package Multithreading.MultithreadingTest;

import java.util.concurrent.Callable;

public class MultithreadingTest {
    public static void main(String[] args) throws InterruptedException {
        // Создание потоков

        // первый способ , создаём new Thread() и в конструктор передаём клас реализующий Runnable
        Thread testThread1 = new Thread(() -> System.out.println("I am working"));

        // второй способ , создайм класс который расширяет  Thread
        Thread testThread2 = new MyThread();


        // запуск потоков вызывая метод run
        testThread1.start();
        testThread2.start();


    }

    static void threadMethods() throws InterruptedException {

        // получить ссылку на текущий поток
        Thread currentThread = Thread.currentThread();

        // Узнать имя текущего потока
        System.out.println(currentThread.getName());

        // усыпить поток в конструкторе указываеься время в милисикундах
        Thread.sleep(1000);

        // переводит поток в состояние runnable
        Thread.yield();

        // получить приоритет потока
        System.out.println(currentThread.getPriority());

        // определяет, выполняеться ли поток
        System.out.println(currentThread.isAlive());

        //  проверяет поток на daemon (daemon - поток которые дохнет после завершения мэйна)
        System.out.println(currentThread.isDaemon());

        // сделать поток demon
        currentThread.setDaemon(true);

        // ожидает завершения потока
        currentThread.join();


    }


}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("I am working too");
    }
}

