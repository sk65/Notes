package Generic;

public class A<E extends Number> {
    E value;

    public A(E value) {
        this.value = value;
    }

    public E getValue() {

        return value;
    }

    boolean testEqual(A<E> a) {
        if (Math.abs(this.value.doubleValue()) == Math.abs(a.value.doubleValue())) {
            return true;
        } else {
            return false;
        }
    }
}
