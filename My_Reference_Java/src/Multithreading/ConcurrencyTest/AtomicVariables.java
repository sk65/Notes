package Multithreading.ConcurrencyTest;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicVariables {
    private static AtomicInteger i = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {

        for (int j = 0; j < 10000; j++) {
            new Thread(() -> i.incrementAndGet()).start();
        }
        Thread.sleep(2000);
        System.out.println(i.get());

    }
}
