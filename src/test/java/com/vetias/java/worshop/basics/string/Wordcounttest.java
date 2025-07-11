package com.vetias.java.worshop.basics.string;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordcountTest {

    @Test
    public void testWordCount() {
        Wordcount wordcount = new Wordcount();
        int count = wordcount.count("this program shows how to count the number of words in a string");
        assertEquals(13, count);
    }

    @Test
    public void testRegularSentence() {
        Wordcount wordcount = new Wordcount();
        int count = wordcount.count("cabel is a good boy");
        assertEquals(5, count);
    }
}
