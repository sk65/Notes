package Lambda;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        IntStream.of(1, -2, 3, -4, 5).filter(value -> value > 0).forEach(System.out::println);

    }

}
