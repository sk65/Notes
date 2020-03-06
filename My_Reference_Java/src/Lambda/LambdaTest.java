package Lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaTest {
    public static void main(String[] args) {
        int i = 4;
        int a = 6;

        // служит для проверки элемента возвращает булеан
        Predicate<Integer> p = (test) -> test < 4;
        System.out.println(p.test(i));

        //что-то делает с элементом ничего не возвращает
        Consumer<String> consumer = s -> System.out.println(s);
        consumer.accept("hello world");

        Consumer<Integer> aa = System.out::println;
        aa.accept(3);

        // выполняет переход от объекта типа Т к объекту типа R
        Function<Integer, Double> function = (value) -> Double.valueOf(value);
        System.out.println(function.apply(1));


        // ссылка на статический метод
        Function<Integer, Double> function1 = Double::valueOf;
        System.out.println(function.apply(1));

        //ссылка на конструктор
        Database database = User::new;
        User user = database.create("Vasia", 27);
        int r = user.getAge();

        System.out.println(getOperation(1).getResult(10, 5));

    }

    private static Operation getOperation(int check) {
        switch (check) {
            case 1:
                return (x, y) -> x * y;

            case 2:
                return (x, y) -> x + y;

            default:
                return (x, y) -> x - y;
        }
    }
}

class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

@FunctionalInterface
interface Database {
    User create(String name, int age);

}

@FunctionalInterface
interface Operation {
    int getResult(int x, int y);

}