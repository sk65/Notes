package Collections.MyArrayLIst;

import java.util.Iterator;

public class ArrayIterator<T> implements Iterator<T> {
    private final T[] data;
    private int cursor;

    public ArrayIterator(T[] data) {
        this.data = data;
    }

    @Override
    public boolean hasNext() {
        return cursor < data.length;
    }

    @Override
    public T next() {
        return data[cursor++];
    }

}
