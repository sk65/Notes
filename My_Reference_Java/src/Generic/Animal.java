package Generic;

class Animal<E extends Number> {
    private E str;

    Animal(E str) {
        this.str = str;
    }

    E getStr() {
        return str;
    }

    boolean test(Animal<?> animal) {
        if (Math.abs(str.doubleValue()) == Math.abs(animal.str.doubleValue())) {
            return true;
        } else {
            return false;
        }
    }
}
