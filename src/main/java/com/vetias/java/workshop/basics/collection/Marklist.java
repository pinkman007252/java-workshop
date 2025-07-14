package com.vetias.java.workshop.basics.collection;



    import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Marklist {
    public static void main(String[] args) {

        List<Integer> marks = List.of(85, 72, 90, 66, 78, 95, 88, 60);

        // Create a new list for ascending sort
        List<Integer> ascendingMarks = new ArrayList<>(marks);
        Collections.sort(ascendingMarks);
        System.out.println("Ascending Order: " + ascendingMarks);

        // Create another list for descending sort
        List<Integer> descendingMarks = new ArrayList<>(marks);
        Collections.sort(descendingMarks, Collections.reverseOrder());
        System.out.println("Descending Order: " + descendingMarks);


        System.out.println("Original List: " + marks);
    }
}

