package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VowelAndConsonantsTest {
    VowelAndConsonants obj;
    @Before
    public void setUp() throws Exception {
         VowelAndConsonants obj = new VowelAndConsonants();
    }

    @After
    public void tearDown() throws Exception {
        VowelAndConsonants obj = null;
    }

    @Test
    public void checkVowelAndConsonants_a() {
        assertEquals("vowel", obj.checkVowelAndConsonants('a'));
    }

    @Test
    public void checkVowelAndConsonants_e() {
        assertEquals("vowel", obj.checkVowelAndConsonants('e'));
    }

    @Test
    public void checkVowelAndConsonants_i() {
        assertEquals("vowel", obj.checkVowelAndConsonants('i'));
    }

    @Test
    public void checkVowelAndConsonants_o() {
        assertEquals("vowel", obj.checkVowelAndConsonants('o'));
    }

    @Test
    public void checkVowelAndConsonants_u() {
        assertEquals("vowel", obj.checkVowelAndConsonants('u'));
    }

    @Test
    public void checkVowelAndConsonants_b() {
        assertEquals("consonant", obj.checkVowelAndConsonants('b'));
    }

    @Test
    public void checkVowelAndConsonants_notAlphabet() {
        assertEquals("invalid", obj.checkVowelAndConsonants('#'));
    }
}