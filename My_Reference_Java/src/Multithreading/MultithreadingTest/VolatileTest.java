package Multithreading.MultithreadingTest;

public class VolatileTest {
    private static /*volatile*/ int i;

    public static void main(String[] args) {
        Thread write = new Thread(() -> {
            while (i < 5) {
                System.out.println("increment to " + (++i));
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread read = new Thread(() -> {
            int localI = i;
            while (localI != 5) {
                if (localI != i) {
                    System.out.println("new value is " + i);
                    localI = i;
                }
            }

        });


        write.start();
        read.start();
    }
}
