package string_class_methods_wrapper_classes_StreangBuilder;

import java.util.Arrays;

public class StreangTest {
    public static void main(String[] args) {

        String streang = " hello world "; // создаём строку и она отправляеться плавать в басеен
        String streang2 = new String(" Hello world "); // эта строка забором(

        // в нижний регистр
        System.out.println(streang.toLowerCase());

        // в верхний регистр
        System.out.println(streang.toUpperCase());

        // принимает индекс , возвращает элемент
        System.out.println(streang.charAt(0));

        // принимает индекс , возвращает кодировку симвора в юникод
        System.out.println(streang.codePointAt(0));

        // возвращает 0 если строки одинаковые , возвращает  число если строки не равны
        System.out.println(streang.compareTo(streang2));

        // тоже самое только игнорирует регистр
        System.out.println(streang.compareToIgnoreCase(streang2));

        // складывает строки
        System.out.println(streang.concat(streang2));

        // сравнивает строки игнорируя регистр
        System.out.println(streang.equalsIgnoreCase(streang2));

        // принимает кодировку юрикод если символ есть возвращяет его индекс если нет то -1
        System.out.println(streang.indexOf(65));

        // возвращает true если длина строки 0
        System.out.println(streang.isEmpty());

        // возвращает длину строки
        System.out.println(streang.length());

        // приниммает разделитель и возвращает массив стрингов
        System.out.println(Arrays.toString(streang.split(" ")));

        // извлекает из строки строку длиной указанной в конструкторе
        System.out.println(streang.substring(0, 3));

        // возвращает массив символов
        System.out.println(Arrays.toString(streang.toCharArray()));

        // обрезает пробелы
        System.out.println(streang.trim());

        // конкатинирует к стрингу
        System.out.println(String.valueOf(78));

        // а можно и так
        System.out.println(7 + "");

        // переводит массив в строку
        System.out.println(String.copyValueOf(new char[]{56, 44, 90}));


    }
}
