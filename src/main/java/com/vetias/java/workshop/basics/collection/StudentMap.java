package com.vetias.java.workshop.basics.collection;

import java.util.HashMap;
import java.util.Map;

public class StudentMap {

    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();

        students.put(1006, "John Doe");
        students.put(1007, "Jane Smith");
        students.put(1008, "Alice Johnson");
        students.put(1009, "Bob Brown");
        students.put(1010, "david black");
        students.put(1011, "david black");

        System.out.println(students);
        System.out.println(students.keySet());
        System.out.println(students.values());

        }
    }

