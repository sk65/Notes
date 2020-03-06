package Generic;

public class Dog<E, T> extends Pet {

    public Dog(Number str, T satr) {
        super(str, satr);
    }

    @Override
    Number getStr() {
        return super.getStr().doubleValue() + 1;
    }
}
