package Multithreading.Buffer;

public class Consumer implements Runnable {

    private SIngleElementBuffer buffer;

    public Consumer(SIngleElementBuffer sIngleElementBuffer) {
        this.buffer = sIngleElementBuffer;
    }

    @Override
    public void run() {
        while (true) {
            try {
                int element = buffer.get();
                System.out.println(element + " consumed");
            } catch (InterruptedException e) {
                e.printStackTrace();
                return;
            }
        }

    }
}
