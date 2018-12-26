package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuessNumberTest {
    GuessNumber obj;
    @Before
    public void setUp() throws Exception {
        GuessNumber obj = new GuessNumber();
    }

    @After
    public void tearDown() throws Exception {
        GuessNumber obj = null;
    }

    @Test
    public void guessNum() {
        assertEquals("Number guessed is less than original number",obj.guessNum(20,77));
        assertEquals("Number guessed is more than original number",obj.guessNum(99,77));
        assertEquals("Number guessed matches the original number",obj.guessNum(77,77));
    }
}