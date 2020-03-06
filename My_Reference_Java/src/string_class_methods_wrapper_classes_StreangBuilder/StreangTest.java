package string_class_methods_wrapper_classes_StreangBuilder;

import java.util.Arrays;

public class StreangTest {
    public static void main(String[] args) {


        String string = " hello world "; // создаём строку и она отправляеться плавать в басеен
        String string2 = new String(" Hello world "); // эта строка забором(

        // в нижний регистр
        System.out.println(string.toLowerCase());

        // в верхний регистр
        System.out.println(string.toUpperCase());

        // принимает индекс , возвращает элемент
        System.out.println(string.charAt(0));
        char[] chars = new char[10];
        string.getChars(0, 0b10, chars, 0);

        // принимает индекс , возвращает кодировку симвора в юникод
        System.out.println(string.codePointAt(0));

        // возвращает 0 если строки одинаковые , возвращает  число если строки не равны
        System.out.println(string.compareTo(string2));

        // тоже самое только игнорирует регистр
        System.out.println(string.compareToIgnoreCase(string2));

        // складывает строки
        System.out.println(string.concat(string2));

        // сравнивает строки игнорируя регистр
        System.out.println(string.equalsIgnoreCase(string2));

        // принимает кодировку юрикод если символ есть возвращяет его индекс если нет то -1
        System.out.println(string.indexOf(65));

        // возвращает true если длина строки 0
        System.out.println(string.isEmpty());

        // возвращает длину строки
        System.out.println(string.length());

        // приниммает разделитель и возвращает массив стрингов
        System.out.println(Arrays.toString(string.split(" ")));

        // извлекает из строки строку длиной указанной в конструкторе
        System.out.println(string.substring(0, 3));

        // возвращает массив символов
        System.out.println(Arrays.toString(string.toCharArray()));

        // обрезает пробелы
        System.out.println(string.trim());

        // конкатинирует к стрингу
        System.out.println(String.valueOf(78));

        // а можно и так
        System.out.println(7 + "");

        // переводит массив в строку
        System.out.println(String.copyValueOf(new char[]{56, 44, 90}));


    }
}
