package Java_I_O;

import java.io.*;

public class BufferTest {
    private final static File FILE = new File("C:\\Users\\мой господин\\Desktop\\Тест\\Test12.txt");

    public static void main(String[] args) throws IOException {
        String st1 = test1();
        String st2 = test2();
        String st3 = test3();
        String st4 = test4();
        System.out.println("\n********************************************");
        System.out.println("Простое чтение побайтам " + st1);
        System.out.println("чтение по байтам с буфером " + st2);
        System.out.println("чтение по байтам с буфером через массив " + st3);
        System.out.println("чтение по байтам без буфера через массив " + st4);

    }

    static String test1() throws IOException {
        try (InputStream in = new FileInputStream(FILE)) {
            int a;
            long start = System.currentTimeMillis();
            while ((a = in.read()) != -1) {
                System.out.print((char) a);
            }
            long finish = System.currentTimeMillis();

            return "" + (finish - start);

        }
    }

    static String test2() throws IOException {
        try (InputStream in = new BufferedInputStream(new FileInputStream(FILE))) {
            int a;
            long start = System.currentTimeMillis();
            while ((a = in.read()) != -1)

            {
                System.out.print((char) a);
            }

            long finish = System.currentTimeMillis();

            return "" + (finish - start);

        }
    }

    static String test3() throws IOException {
        try (InputStream in = new BufferedInputStream(new FileInputStream(FILE))) {
            byte[] bytes = new byte[64 * 1024];
            int count;
            long start = System.currentTimeMillis();
            while ((count = in.read(bytes)) != -1) {
                System.out.print(new String(bytes, 0, count, "UTF-8"));
            }
            long finish = System.currentTimeMillis();

            return "" + (finish - start);
        }
    }

    static String test4() throws IOException {
        try (InputStream in = new FileInputStream(FILE)) {
            byte[] bytes = new byte[64 * 1024];
            int count;
            long start = System.currentTimeMillis();
            while ((count = in.read(bytes)) != -1) {
                System.out.print(new String(bytes, 0, count, "UTF-8"));
            }
            long finish = System.currentTimeMillis();

            return "" + (finish - start);
        }
    }
}
