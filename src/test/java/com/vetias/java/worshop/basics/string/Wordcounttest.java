package com.vetias.java.workshop.basics.string;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Wordcounttest {
  @Test
    public void testWordCount() {
       Wordcount Wordcount = new Wordcount();
        int count = Wordcount.count("this program shows how to count the number of words in a string");

        assertEquals(13, count);
    }

    @Test
    public void testEmptyString() { 
        Wordcount Wordcount = new Wordcount();
        int count = Wordcount.count("cabel is a good boy");

        assertEquals(5, count);
    }
}