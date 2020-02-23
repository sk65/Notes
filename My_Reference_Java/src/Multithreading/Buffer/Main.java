package Multithreading.Buffer;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        SIngleElementBuffer buffer = new SIngleElementBuffer();
        Thread test1 = new Thread(new Producer(0, 500, buffer));
        Thread test2 = new Thread(new Consumer(buffer));
       // test1.setDaemon(true);
       // test2.setDaemon(true);
        test1.start();
        test2.start();
       // Thread.sleep(3000);
    }
}
