package RegEx_GUI;

import java.util.ArrayList;

public class RegEx {
    public static void main(String[] args) {
        String s = "-22+27/5847*5-5";
        char[] chars = s.toCharArray();

        ArrayList<String> list = new ArrayList<>(chars.length);

        StringBuilder str = new StringBuilder(chars.length);

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '+' || chars[i] != '-' || chars[i] != '/' || chars[i] != '*') {

                if (chars[i] != '+' && chars[i] != '-' && chars[i] != '/' && chars[i] != '*') {
                    str.append(chars[i]);
                }
                if (i == chars.length - 1) {
                    list.add(str.toString());
                    str.delete(0, i);
                }
            }


            if (chars[i] == '+' || chars[i] == '-' || chars[i] == '/' || chars[i] == '*') {
                list.add(str.toString());
                list.add(String.valueOf(chars[i]));
                str.delete(0, i);
            }
        }


        for (String string : list) {
            System.out.println(string);
        }
    }

    private void stringToList(String string) {

        char[] chars = string.toCharArray();

        ArrayList<String> list = new ArrayList<>(chars.length);

        StringBuilder str = new StringBuilder(chars.length);

        for (int i = 0; i < chars.length; i++) {

            if (chars[i] != '+') {
                str.append(chars[i]);
                if (i == chars.length - 1) {
                    list.add(str.toString());
                    str.delete(0, i);
                }
            }
            if (chars[i] == '+') {
                list.add(str.toString());
                list.add(String.valueOf(chars[i]));
                str.delete(0, i);
            }
        }


    }
}
