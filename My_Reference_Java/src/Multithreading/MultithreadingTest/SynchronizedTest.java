package Multithreading.MultithreadingTest;

public class SynchronizedTest {
    public static void main(String[] args) {

        // первый пример
       /* Thread testThread1 = new Thread(() -> synchronizedTest());
        Thread testThread2 = new Thread(() -> synchronizedTest());
        testThread1.start();
        testThread2.start();*/

        // второй пример

        Object monitor = new Object();

        Thread testThread3 = new MyThread1(monitor);
        Thread testThread4 = new MyThread1(monitor);
        testThread3.start();
        testThread4.start();

    }

    static synchronized void synchronizedTest() {

        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " I am working");
            Thread.yield();
        }
        System.out.println(Thread.currentThread().getName() + " I am dead");
    }


}

class MyThread1 extends Thread {
    private Object monitor;

    public MyThread1(Object monitor) {
        this.monitor = monitor;
    }

    @Override
    public void run() {
        synchronized (monitor) {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " I am working");
            }
            System.out.println(Thread.currentThread().getName() + " I am dead");

        }
    }
}
