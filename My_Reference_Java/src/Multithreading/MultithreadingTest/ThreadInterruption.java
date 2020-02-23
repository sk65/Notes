package Multithreading.MultithreadingTest;

public class ThreadInterruption {
    public static void main(String[] args) throws InterruptedException {

        // первый пример
/*
        Thread thread = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println(Thread.currentThread().getName() + " I am alive");
            }
        });
        thread.start();
        Thread.sleep(20);
        thread.interrupt();*/

        // второй пример

        Thread thread1 = new Thread(() -> {

            System.out.println(Thread.currentThread().getName() + " I am going to bad");
            try {
                Thread.sleep(Integer.MAX_VALUE);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println(Thread.currentThread().getName() +" I woke up");
            }

        });
        thread1.start();
        Thread.sleep(20);
        thread1.interrupt();

    }
}
