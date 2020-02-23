package Multithreading.MultithreadingTest;

public class JoinTest {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " I am working");
        }
        Thread testThread1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " I am working");
            }
            System.out.println(Thread.currentThread().getName() + "I am dead");
        });
        Thread testThread2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " I am working");
            }
            System.out.println(Thread.currentThread().getName() + "I am dead");
        });

        testThread1.start();
        testThread1.join();
        testThread2.start();
        testThread2.join();


        System.out.println(Thread.currentThread().getName() + " I am dead");
    }
}
