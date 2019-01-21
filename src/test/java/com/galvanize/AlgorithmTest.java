package com.galvanize;

import org.junit.Test;

import java.util.HashMap;

import static junit.framework.TestCase.*;

public class AlgorithmTest {

    @Test
    public void allEqualTest() {
        Algorithm algorithm = new Algorithm();
        assertTrue(algorithm.allEqual("aAa"));
        assertFalse(algorithm.allEqual("bbBbabbb"));
        assertFalse(algorithm.allEqual(""));
    }

    @Test
    public void letterCountTest() {
        Algorithm algorithm = new Algorithm();
        HashMap<String, Integer> test = new HashMap<>();
        test.put("a", 2);
        assertEquals(test, algorithm.letterCount("aA"));
        HashMap<String, Integer> test2 = new HashMap<>();
        test2.put("a", 1);
        test2.put("b", 2);
        test2.put("c", 1);
        test2.put("d", 1);
        assertEquals(test2, algorithm.letterCount("abBcd"));
        assertEquals(new HashMap<>(),algorithm.letterCount(""));
    }

    @Test
    public void interleaveTest() {
        Algorithm algorithm = new Algorithm();
        String[] a1 = new String[]{"h", "l", "o", "w", "r", "d"};
        String[] a2 = new String[]{"e", "l", " ", "o", "l", "!"};
        assertEquals("hello world!", algorithm.interleave(a1, a2));
    }
}
