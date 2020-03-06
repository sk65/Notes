package Collections.MyArrayLIst;

import java.util.Iterator;

public class MyArrayList<E> implements Iterable<E> {
    private E[] dataArray;
    private final int INITIAL_CAPACITY = 10;
    private int size;

    public MyArrayList() {
        dataArray = (E[]) new Object[INITIAL_CAPACITY];
    }

    public MyArrayList(int initial_capacity) {
        if (initial_capacity > 0) {
            dataArray = (E[]) new Object[initial_capacity];
        }
    }

    public void add(E e) {
        if (size < dataArray.length) {
            dataArray[size++] = e;

        } else {
            Object[] temp = dataArray;
            dataArray = (E[]) new Object[dataArray.length * 2];
            System.arraycopy(temp, 0, dataArray, 0, temp.length);
            dataArray[size++] = e;

        }
    }

    public void add(int index, E e) {
        if (dataArray.length > size) {
            System.arraycopy(dataArray, index, dataArray, index + 1, dataArray.length - index - 1);
            dataArray[index] = e;
            size++;
        } else {
            Object[] temp = dataArray;
            dataArray = (E[]) new Object[dataArray.length * 2];
            System.arraycopy(temp, 0, dataArray, 0, temp.length);
            System.arraycopy(dataArray, index, dataArray, index + 1, dataArray.length - index - 1);
            dataArray[index] = e;
            size++;
        }
    }

    public void set(int index, E e) {
        dataArray[index] = e;
    }

    public E get(int index) {
        if (index < size) {
            return (E) dataArray[index];
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public void remove(E e) {

        for (int i = 0; i < size; i++) {
            if (dataArray[i].equals(e)) {
                System.arraycopy(dataArray, i + 1, dataArray, i, dataArray.length - i - 1);
                dataArray[size - 1] = null;
                size--;
            }
        }


    }

    public boolean contains(E e) {
        for (int i = 0; i < size; i++) {
            if (dataArray[i].equals(e)) return true;
        }
        return false;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        if (size == 0) {
            return "{}";
        } else {
            StringBuilder sb = new StringBuilder("{");
            for (int i = 0; i < size; i++) {
                if (i == size - 1) {
                    sb.append(" " + dataArray[i] + " }");
                } else {
                    sb.append(" " + dataArray[i] + ",");
                }

            }
            return sb.toString();
        }
    }

    @Override
    public Iterator<E> iterator() {
        return new MyArrayListIterator<>(dataArray, size);
    }

    private class MyArrayListIterator<E> implements Iterator<E> {
        private E[] dataArray;
        private int size;
        private int cursor;

        MyArrayListIterator(E[] dataArray, int size) {
            this.dataArray = dataArray;
            this.size = size;
        }

        @Override
        public boolean hasNext() {
            return cursor < size;
        }

        @Override
        public E next() {
            return dataArray[cursor++];
        }
    }
}
