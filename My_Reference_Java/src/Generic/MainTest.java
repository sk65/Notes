package Generic;

import java.util.HashMap;
import java.util.List;

public class MainTest {


    // <?> любой объект
    // <E> только объект данного класса
    // <E , T>
    // <E extends T> может быть один конкретный класс насдедующий T
    // <? extends T> может быть любой класс насдедующий T


    public static void main(String[] args) {
      /*  Animal<Integer> s = new Animal<>(1);
        //System.out.println(s.getStr());
        // Dog<String> dog = new Dog<>("BBB");
        Integer integer = 4;
        System.out.println();
        Animal<Double> test1 = new Animal<>(1.25);
        Animal<Float> test2 = new Animal<>(-1.25F);
        System.out.println(test1.test(test2));

        HashMap<Integer, String> test = new HashMap<>();
        test.put(1, "a");
        test.put(2, "b");
        test.put(3, "c");
        for (Integer s1 : test.keySet()) {
            System.out.println(test.get(s1));
        }*/
        String sad = "22+3*7";
        sad.contains("+");
    }

}
