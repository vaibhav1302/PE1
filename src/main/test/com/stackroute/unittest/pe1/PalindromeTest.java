package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PalindromeTest {
    Palindrome obj;
    @Before
    public void setUp() throws Exception {
        Palindrome obj = new Palindrome();
    }

    @After
    public void tearDown() throws Exception {
        Palindrome obj = null;
    }

    @Test
    public void checkSum() {
        boolean expectedRes = true;
        boolean actualRes = obj.checkSumOfEven("468864");
        assertEquals(expectedRes, actualRes);
    }

    @Test
    public void checkSumNegative() {
        boolean expectedRes = false;
        boolean actualRes = obj.checkSumOfEven("1234");
        assertEquals(expectedRes, actualRes);
    }

    @Test
    public void checkPalindrome() {
        boolean expectedRes = true;
        boolean actualRes = obj.checkPalindrome("12344321");
        assertEquals(expectedRes, actualRes);
    }

    @Test
    public void checkPalindromeNegative() {
        boolean expectedRes = false;
        boolean actualRes = obj.checkPalindrome("1234567");
        assertEquals(expectedRes, actualRes);
    }
}