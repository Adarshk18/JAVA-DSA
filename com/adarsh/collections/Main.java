package com.adarsh.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

       /* list2.add(23);
        list2.add(45);
        list2.add(51);
        list2.add(67);

        // Arraylist is much faster than vector cuz Arraylist can access multiple threads at a time while vector can access one at a time
        System.out.println(list2);*/

        List<Integer> vector = new Vector<>();
        vector.add(45);
        vector.add(5);
        vector.add(455);
        vector.add(451);

        System.out.println(vector);

    }
}
