package Java_I_O;

import java.io.*;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class JavaNio {
    /**
     * класы Files и Path
     */
    public static void main(String[] args) throws IOException {


        // операции при помощи Files;
        File src = new File("test.txt");

        File target = new File("test1.txt");

        Path srcPath = src.toPath();
        Path targetPath = src.toPath();

        // копирование при помощи Files;
        Files.copy(srcPath, targetPath);

        // перемещение при помощи Files;
        Files.move(src.toPath(), target.toPath(), StandardCopyOption.REPLACE_EXISTING);

        // удалить если существует
        Files.deleteIfExists(targetPath);

        //прочитать файл в массив байтов
        byte[] bytes = Files.readAllBytes(srcPath);
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }

        //записать файл в массив байтов
        Files.write(src.toPath(), "123qw".getBytes());

        // чтение
        java.util.List<String> list = Files.readAllLines(src.toPath());

        //пройтись по дереву
        Files.walkFileTree(Paths.get("."), new MyFileVisitor());

    }
}

