package Collections.ComparatorExample;

import java.util.*;

public class Test {
    public static void main(String[] args) {

        Set<User> set = new TreeSet<>(new UserComparator());

        set.add(new User("A", 10, true));
        set.add(new User("A", 14556, true));
        set.add(new User("Bac", 10, true));
        set.add(new User("Bab", 10, true));
        set.add(new User("C", 10, false));
        set.add(new User("a", 100, false));
        set.add(new User("bA", 111, true));
        set.add(new User("ba", 111, true));
        set.add(new User("c", 11, false));
        set.forEach(x -> System.out.println(x.toString()));


    }
}
