package com.vetias.java.workshop.basics.collection;
import java.util.HashSet;
import java.util.Set;
public class StutdentSet {

 

    public static void main(String[] args) {
        Set<Integer> rollNos = new HashSet<>();
        rollNos.add(1);
        rollNos.add(2);
        rollNos.add(3);
        rollNos.add(4);
        rollNos.add(5);

        System.out.println("Set contents: " + rollNos);
        System.out.println("Iterating through the set:");
        for (Integer rollNo : rollNos) {
            System.out.println(rollNo);
        }
    }
}

