package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PatternTest {
    Pattern obj;
    @Before
    public void setUp() throws Exception {
        Pattern obj = new Pattern();
    }

    @After
    public void tearDown() throws Exception {
        Pattern obj = null;
    }

    @Test
    public void printPattern() {
        assertEquals("122333",obj.printPattern(3));
        assertEquals("122",obj.printPattern(2));
        assertEquals("1223334444",obj.printPattern(4));
        assertEquals("122333444455555",obj.printPattern(5));
        assertEquals("1",obj.printPattern(1));
    }
}