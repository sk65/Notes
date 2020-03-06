package Collections.MyLinkedList;

import java.util.Iterator;

public class MyLinkedList<E> implements Iterable<E> {
    private Node node;
    private Node head;
    private int size;

    public void add(E e) {
        if (size == 0) {
            head = new Node<>(e);
            node = head;
            size++;
        } else {
            node = node.nextElement = new Node<>(e);
            size++;
        }
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node current = head;
        int cursor = 0;
        while (current != null) {
            if (index == cursor) {
                return (E) current.value;
            }
            current = current.nextElement;
            cursor++;
        }
        return null;
    }

    public boolean remove(E e) {
        Node current = head;
        int cursor = 0;
        if (head.value.equals(e)) {
            head = current.nextElement;
            size--;
            return true;
        }
        while (current != null) {
            if (cursor == size - 1) {
                throw new IndexOutOfBoundsException();
            }
            if (current.nextElement.value.equals(e)) {
                current.nextElement = current.nextElement.nextElement;
                size--;
                return true;
            }
            current = current.nextElement;
            cursor++;
        }
        return false;
    }

    public boolean remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node current = head;
        int counter = 0;
        if (index == 0) {
            remove((E) head.value);
            return true;
        } else {
            while (current != null) {
                if (counter == index - 1) {
                    current.nextElement = current.nextElement.nextElement;
                    size--;
                    return true;
                }
                current = current.nextElement;
                counter++;
            }
        }
        return true;
    }

    public boolean contains(E e) {
        Node current = head;
        while (current != null) {
            if (current.value.equals(e)) return true;
            current = current.nextElement;
        }
        return false;
    }

    public void set(int index, E e) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node current = head;
        int counter = 0;
        while (current != null) {
            if (index == counter) {
                current.value = e;
                return;
            }
            current = current.nextElement;
            counter++;
        }
    }

    public void add(int index, E e) {
        if (index < 0 || index >= size + 1) {
            throw new IndexOutOfBoundsException();
        } else if (size == 0) {
            add(e);
        } else if (size == 1) {
            Node temple = new Node<>(e);
            temple.nextElement = head;
            head = temple;
            size++;
        } else {
            Node current = head;
            int counter = 0;
            while (current != null) {
                if (counter == index - 1) {
                    Node temple = new Node<>(e);
                    temple.nextElement = current.nextElement;
                    current.nextElement = temple;
                    size++;
                    return;
                }
                current = current.nextElement;
                counter++;
            }
        }
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        if (size == 0) return "{ }";
        StringBuilder sb = new StringBuilder("{ ");
        Node current = head;
        int counter = 0;
        while (current != null) {
            if (counter == size - 1) {
                sb.append(current.value + " }");
                break;
            } else {
                sb.append(current.value + ", ");
                current = current.nextElement;
                counter++;
            }
        }

        return sb.toString();
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<>() {
            int cursor;

            @Override
            public boolean hasNext() {
                return cursor < size;
            }

            @Override
            public E next() {
                return get(cursor++);
            }
        };

    }

    class Node<E> {
        protected E value;
        protected Node nextElement;

        public Node(E value) {
            this.value = value;

        }
    }
}
