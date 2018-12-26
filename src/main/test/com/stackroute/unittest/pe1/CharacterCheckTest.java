package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CharacterCheckTest {
    CharacterCheck obj;
    @Before
    public void setUp() throws Exception {
        CharacterCheck obj = new CharacterCheck();
    }

    @After
    public void tearDown() throws Exception {
        CharacterCheck obj = null;
    }

    @Test
    public void checkChar() {
        assertEquals("Small letter",obj.checkChar("a"));
        assertEquals("Capital letter",obj.checkChar("K"));
        assertEquals("Digit",obj.checkChar("9"));
        assertEquals("Special Character",obj.checkChar("$"));
        assertEquals("Error",obj.checkChar("abT"));
    }
}