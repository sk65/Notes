package Java_I_O;

import java.io.*;
import java.util.Arrays;


public class FileExamples {
    public static void main(String[] args) throws IOException {
        //File.separator
        String separator = File.separator;//разделитель, для каждой опирационки свой
        File file = new File("Users\\мой господин\\Desktop\\RecursiveTraversalFolderTree.txt");

        //просматриваем файлы
        System.out.println(Arrays.toString(file.list()));//возвращает массив строк
        File[] listFiles = file.listFiles();//возвращает массив файлов

        //создаём файл
        if (!file.exists()) file.createNewFile();

        //создаём папку
        File dir = new File("C:\\Users\\мой господин\\Desktop\\Новая папка (8)");
        if (!dir.exists()) dir.mkdir();

        // возвращает массив строк
        String[] dirList = dir.list();

        //возвращает масив файлов
        File[] files = dir.listFiles();

        // абсолютный путь к файлу/папке
        System.out.println(dir.getAbsolutePath());

    }

    //рекурсивный обход папок

    static void folderTraversal(File dir) {
        File[] folderTree = dir.listFiles();
        try {
            new File(dir.getAbsolutePath() + File.separator + "NewFile.txt").createNewFile();
        } catch (IOException e) {
            System.out.println("вот чёрт не волучилось");
        }

        for (int i = 0; i < folderTree.length; i++) {
            if (folderTree[i].isDirectory()) {
                File file = new File(folderTree[i].getAbsolutePath() + "\\NewFile.txt");
                try {
                    file.createNewFile();
                } catch (IOException e) {
                    System.out.println("вот чёрт не волучилось");
                }
                folderTraversal(folderTree[i]);
            } else {
                if (folderTree[i].getName().endsWith(".txt"))
                    System.out.println(folderTree[i].getName());

            }
        }

    }

    // удаление папки
    static void deleteDir(File dir) {
        File[] directories = dir.listFiles();
        if (directories.length == 0) {
            dir.delete();
        } else {
            for (File file : directories) {
                if (file.isDirectory()) {
                    deleteDir(file);
                    file.delete();
                } else {
                    file.delete();
                }
            }
        }
        dir.delete();

    }

    //пример с FileFilter
    static void deliteTxtFiles(File dir) {
        File[] files = dir.listFiles((x, y) -> y.toLowerCase().endsWith(".jpg"));
        for (File file : files) {
            System.out.println(file.getName());
        }
    }


}
