package Multithreading.Buffer;

public class Producer implements Runnable {
    private int startValue;
    private final int period;
    private SIngleElementBuffer buffer;


    public Producer(int startValue, int period, SIngleElementBuffer buffer) {
        this.period = period;
        this.startValue = startValue;
        this.buffer = buffer;

    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println(startValue + " produced");
                buffer.put(startValue++);
                Thread.sleep(period);
            } catch (InterruptedException e) {
                e.printStackTrace();
                return;
            }
        }

    }
}
