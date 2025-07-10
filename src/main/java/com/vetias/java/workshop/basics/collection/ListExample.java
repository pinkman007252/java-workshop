package com.vetias.java.workshop.basics.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("cabel");
        names.add("submarine");
        names.add("shahul");
        names.add("logesh");
        names.add("karthik");
        names.add("siva");

        System.out.println(names);
        names.set (0, "cabel");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
        names.sort(Comparator.naturalOrder());
        System.out.println( names);
    }
}
