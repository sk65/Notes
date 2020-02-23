package Multithreading.Buffer;

import java.util.ArrayList;
import java.util.List;

public class SIngleElementBuffer {
    private List<Integer> list;

    public SIngleElementBuffer() {
        this.list = new ArrayList<>();
    }

    public synchronized void put(Integer newElement) throws InterruptedException {

        while (list.size() != 0) {
            this.wait();
        }
        list.add(newElement);
        this.notifyAll();

    }

    public synchronized Integer get() throws InterruptedException {
        while (list.size() == 0) {
            this.wait();
        }
        int result = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        this.notifyAll();
        return result;
    }

}
