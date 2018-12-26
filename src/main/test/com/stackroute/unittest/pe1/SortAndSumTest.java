package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SortAndSumTest {
    SortAndSum obj;
    @Before
    public void setUp() throws Exception {
        SortAndSum obj = new SortAndSum();
    }

    @After
    public void tearDown() throws Exception {
        SortAndSum obj = null;
    }

    @Test
    public void reverseStr() {
        assertEquals("887743222",obj.reverseStr("783242872"));
        assertEquals("4321",obj.reverseStr("2314"));
    }

    @Test
    public void calculateSum() {
        assertEquals(26,obj.CalculateSum("783242872"));
        assertEquals(6,obj.CalculateSum("2314"));
    }

    @Test
    public void checkSum() {
        assertEquals(true,obj.checkSum(26));
        assertEquals(false,obj.checkSum(6));
    }
}