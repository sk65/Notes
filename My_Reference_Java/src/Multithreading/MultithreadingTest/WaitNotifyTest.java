package Multithreading.MultithreadingTest;

public class WaitNotifyTest {


    public static void main(String[] args) throws InterruptedException {
        final Object monitor = new Object();
        for (int i = 0; i < 5; i++) {
            new MyThread2(monitor).start();
        }

        MyThread2 thread = new MyThread2(monitor);
        thread.start();
        Thread.sleep(2000);
        thread.signal();
    }
}

class MyThread2 extends Thread {
    private final Object monitor;

    public MyThread2(Object monitor) {
        this.monitor = monitor;
    }

    @Override
    public void run() {
        synchronized (monitor) {
            try {
                System.out.println(Thread.currentThread().getName() + " жду");
                monitor.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " проснулся");
        }
    }

    public void signal() {
        synchronized (monitor) {
            monitor.notifyAll();
        }
    }

}
