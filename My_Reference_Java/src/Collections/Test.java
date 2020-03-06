package Collections;

import Collections.MyArrayLIst.MyArrayList;
import Collections.MyLinkedList.MyLinkedList;

import java.util.*;

public class Test {
    public static void main(String[] args) {
     /*   MyArrayList<String> d = new MyArrayList<>(100);
        d.add("1");
        d.add("2");
        d.add("4");
        d.add("5");
        //System.out.println(d.toString());
        d.set(2, "100");
        //System.out.println(d.toString());
        for (String s : d) {
            System.out.println(s);
        }*/

      /*  MyLinkedList<String> s = new MyLinkedList<>();
        s.add("a");
        s.add("b");
        s.add("s");
        s.add("d");
        s.add("e");*/
//        System.out.println(s.toString());
//        s.set(0, "aaa");
//        System.out.println(s.toString());
//        System.out.println(s.toString());
//        s.add(2, "aaa");
       /* System.out.println(s.toString());

        for (String string : s) {
            System.out.print(string + ", ");
        }*/


        Queue<String> queue1 = new PriorityQueue<>();
        queue1.add("d");
        queue1.add("b");
        queue1.add("a");
        queue1.add("c");
        queue1.add("e");
        while (!queue1.isEmpty()) {
            System.out.println(queue1.poll());
        }



    }
}
