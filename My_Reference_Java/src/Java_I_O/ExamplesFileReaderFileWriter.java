package Java_I_O;

import java.io.*;
import java.net.URL;
import java.util.Scanner;

public class ExamplesFileReaderFileWriter {
    public static void main(String[] args) throws Exception {

    }

    // чтение из файла по сиволам
    static void readByChars() throws Exception {
        File file = new File("C:\\Users\\мой господин\\Desktop\\Тест\\Test12.txt");
        try (Reader in = new FileReader(file)) {
            int buffer;
            while ((buffer = in.read()) != -1) {
                System.out.print((char) buffer);
            }
        }
    }

    // чтение из файла c масивом сиволам
    static void readByArrayChars() throws Exception {
        File file = new File("C:\\Users\\мой господин\\Desktop\\Тест\\Test12.txt");
        try (Reader reader = new FileReader(file)) {
            char[] charBuffer = new char[50];
            int counter;
            while ((counter = reader.read(charBuffer)) != -1) {
                System.out.println(new String(charBuffer, 0, counter));
            }
        }
    }

    // запись в файл
    static void WriteInFile() throws IOException {
        File file = new File("C:\\Users\\мой господин\\Desktop\\Тест\\Test12.txt");
        try (Writer writer = new BufferedWriter(new FileWriter(file, true))) {
            writer.write("я попал в файл\n");
        }
    }

    // пример с BufferedReader
    static void bufferedReaderExample() throws Exception {
        File file = new File("C:\\Users\\мой господин\\Desktop\\Тест\\Test12.txt");
        //чтение
        try (Reader reader = new BufferedReader(new FileReader(file))) {
            int counter;
            char[] bufferhars = new char[64 * 1024];
            while ((counter = reader.read(bufferhars)) != -1) {
                System.out.println(new String(bufferhars, 0, counter));
            }
        }
    }

    // пример с InputStreamReader
    static void readWeb() {
        File htmlFile = new File("C:\\Users\\мой господин\\Desktop\\Тест\\htmlTest.html");
        try (InputStream in = new URL("https://lenta.ru/").openStream();
             Reader reader = new InputStreamReader(in, "UTF-8");
             BufferedWriter fr = new BufferedWriter(new FileWriter(htmlFile))) {

            char[] buffer = new char[16];
            int count;

            while ((count = reader.read(buffer)) != -1) {
                fr.write(new String(buffer, 0, count));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // пример с CharArrayReader
    static void readFromCharArray() throws Exception {
        try (Reader in = new BufferedReader(new CharArrayReader(new char[]{45, 58, 54, 78, 42}))) {
            char[] charBuffer = new char[50];
            int counter;
            StringBuilder stringBuilder = new StringBuilder();
            while ((counter = in.read(charBuffer)) != -1) {
                stringBuilder.append(new String(charBuffer, 0, counter));
            }
            System.out.println(stringBuilder.toString());
        }
    }

    // пример с CharArrayWriter
    static void writeWithCharArray() throws Exception {
        String testString = "Hello World";
        char[] chars;
        try (CharArrayWriter charArrayWriter = new CharArrayWriter()) {
            charArrayWriter.write(testString);
            chars = charArrayWriter.toCharArray();
        }
        System.out.println(new String(chars));

    }

    //пишем при помощи PrintWriter
    static void printWriterExample() throws Exception {
        try (PrintWriter printWriter = new PrintWriter(new FileWriter("C:\\Users\\мой господин\\Desktop\\Тест\\Test12.txt"))) {
            printWriter.println("hfghgfh");
            printWriter.println("hfghsdfdsfwedabcdifjhgfh");
        }
    }

    // пример со Saner
    static void sanerExample() throws Exception {
        try (Scanner scanner = new Scanner(
                new BufferedReader
                        (new FileReader(
                                new File("C:\\Users\\мой господин\\Desktop\\Тест\\Test12.txt"))))) {
            while (scanner.hasNext()) {
                System.out.println(scanner.next());
            }
        }
    }
}
