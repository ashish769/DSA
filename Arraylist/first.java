package Arraylist;

import java.util.*;

public class first {

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(0);
        list.add(2);
        list.add(3);

        System.out.println(list);

        int elem = list.get(0);
        System.out.println(elem);

        // to add the elem in between
        list.add(1, 4);
        System.out.println(list);

        // set element
        list.set(0, 5);
        System.out.println(list);

        // delete element
        list.remove(2);
        System.out.println(list);

        // size
        System.out.println(list.size());

        // sorting
        Collections.sort(list);
        System.out.println(list);

    }

}
