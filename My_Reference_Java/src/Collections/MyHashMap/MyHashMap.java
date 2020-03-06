package Collections.MyHashMap;

import java.util.HashMap;

public class MyHashMap<K, V> {
    private Node[] dataArray;
    private final int INITIAL_CAPACITY = 16;
    private double loadFactor = 0.75;
    private int size;

    public MyHashMap() {
        dataArray = new Node[16];
    }

    public void put(K key, V value) {


    }


    class Node<E> {
        E value;
        Node<E> nextElement;

        public Node(E value) {
            this.value = value;
        }
    }

}
