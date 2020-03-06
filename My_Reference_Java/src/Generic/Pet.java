package Generic;

public class Pet<E extends Number, T> extends Animal {
    T satr;

    Pet(E str, T satr) {
        super(str);
        this.satr = satr;
    }



    public T getSatr() {
        return satr;
    }
}
