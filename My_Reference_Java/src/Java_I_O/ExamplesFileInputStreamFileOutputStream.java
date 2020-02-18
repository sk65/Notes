package Java_I_O;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class ExamplesFileInputStreamFileOutputStream {
    public static void main(String[] args) throws IOException {

    }

    // чтение из файла по байтам
    static void readFromFileByBytes() throws IOException {
        try (InputStream in = new FileInputStream("C:\\Users\\мой господин\\Desktop\\Тест\\Новая папка\\1.jpg")) {
            int buffer;
            while ((buffer = in.read()) != -1) {
                System.out.println((char) buffer);
            }
        }
    }

    // чтение с использованием  массива байтов
    static void readFromFileByArrayBytes() throws IOException {
        /* try (InputStream in = new FileInputStream("C:\\Users\\мой господин\\Desktop\\Тест\\Test12.txt")) {
            byte[] buffer = new byte[5];
            while (true) {
                int count = in.read(buffer);
                if (count != -1) {
                    System.out.println(new String(buffer, 0, count, "UTF-8"));
                }
            }
        }*/

        try (InputStream in = new FileInputStream("C:\\Users\\мой господин\\Desktop\\Тест\\Test12.txt")) {
            byte[] buffer = new byte[64 * 1024];
            int counter;
            while ((counter = in.read(buffer)) != -1) {
                System.out.println(new String(buffer, 0, counter, "UTF-8"));
            }

        }
    }

    // запись в файл
    static void writeToFile() throws IOException {
        try (InputStream in = new FileInputStream("C:\\Users\\мой господин\\Desktop\\Тест\\Новая папка\\1.jpg");
             OutputStream os = new FileOutputStream("C:\\Users\\мой господин\\Desktop\\Тест\\Новая папка\\11.jpg")) {
            byte buffer[] = new byte[64 * 1024];
            int counter;
            while ((counter = in.read(buffer)) != -1) {
                os.write(buffer, 0, counter);
            }
        }
    }

    // запись в массив байтов через ByteArrayOutputStream
    static byte[] creatBytesArray() throws IOException {

        try (InputStream in = new FileInputStream("C:\\Users\\мой господин\\Desktop\\Тест\\Test12.txt");
             ByteArrayOutputStream outputStream = new ByteArrayOutputStream()) {
            byte[] buffer = new byte[64 * 1024];
            int counter;
            while ((counter = in.read(buffer)) != -1) {
                outputStream.write(buffer, 0, counter);
            }
            return outputStream.toByteArray();
        }
    }

    // чтение из массива байтов через ByteArrayInputStream
    static void readingFromArrayBytes() throws Exception {
        try (BufferedInputStream in = new BufferedInputStream(new ByteArrayInputStream(new byte[]{56, 78, 78, 65, 22, 77, 77}))) {
            byte[] buffer = new byte[64 * 1024];
            int counter;
            while ((counter = in.read(buffer)) != -1) {
                System.out.println(new String(buffer, 0, counter));
            }
        }
    }

    // Пример с BufferedInputStream
    static void bufferedInputStreamExample() throws Exception {
        try (InputStream in = new BufferedInputStream(new FileInputStream("C:\\Users\\мой господин\\Desktop\\Тест\\Новая папка\\11.jpg"))) {
            byte[] bytes = new byte[64 * 1024];
            int count;
            while ((count = in.read(bytes)) != -1) {
                System.out.print(new String(bytes, 0, count, "UTF-8"));
            }

        }
    }

    // Пример с DataInputStream и DataOutputStream
    static void dataInputScreamDataOutputStearne() throws Exception {
        File testFile = new File("C:\\Users\\мой господин\\Desktop\\Тест\\dataTest.bin");
        if (!testFile.exists()) testFile.createNewFile();
        int srcInt = 5, targetInt;
        String srcString = "hello";
        String targetString;
        float[] srcArray = new float[100000];
        float[] targetArray;
        try (OutputStream out = new BufferedOutputStream(new FileOutputStream(testFile));
             DataOutputStream dataOut = new DataOutputStream(out)) {

            for (int i = 0; i < 100000; i++) {
                srcArray[i] = i;
            }
            dataOut.writeInt(srcInt);
            dataOut.writeUTF(srcString);
            dataOut.writeInt(srcArray.length);
            for (int i = 0; i < srcArray.length; i++) {
                dataOut.writeFloat(srcArray[i]);
            }
        }


        try (InputStream is = new BufferedInputStream(new FileInputStream(testFile));
             DataInputStream dataIn = new DataInputStream(is)) {

            System.out.println(targetInt = dataIn.readInt());
            System.out.println(targetString = dataIn.readUTF());
            targetArray = new float[dataIn.readInt()];
            for (int i = 0; i < targetArray.length; i++) {
                targetArray[i] = dataIn.readFloat();

            }
        }
        System.out.println(targetString + " " + targetInt);
        System.out.println(Arrays.toString(targetArray));
    }

    //transient - указывает на то что при сереализации поле будет нул
    //Serializable - разрешает запись сериализацию

    // пример с ObjectOutputStream
    static void objectOutputStreamExample() throws Exception {

        ArrayList<Integer> testSer = new ArrayList<>();
        testSer.add(65);
        File testSerFile = new File("C:\\Users\\мой господин\\Desktop\\Тест\\testSer.bin");

        try (OutputStream os = new BufferedOutputStream(new FileOutputStream(testSerFile));
             ObjectOutputStream oos = new ObjectOutputStream(os)) {
            oos.writeObject(testSer);
        }
    }

    // пример с ObjectInputStream
    static void objectINtputStreamExample() throws Exception {
        File testSerFile = new File("C:\\Users\\мой господин\\Desktop\\Тест\\testSer.bin");
        ArrayList<Integer> testSerRead;
        try (InputStream is = new BufferedInputStream(new FileInputStream(testSerFile));
             ObjectInputStream ois = new ObjectInputStream(is)) {
            testSerRead = (ArrayList<Integer>) ois.readObject();
        }
        System.out.println(testSerRead.size());
    }
}
