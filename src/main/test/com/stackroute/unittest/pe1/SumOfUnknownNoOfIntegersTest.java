package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumOfUnknownNoOfIntegersTest {
    SumOfUnknownNoOfIntegers obj;
    @Before
    public void setUp() throws Exception {
        SumOfUnknownNoOfIntegers obj = new SumOfUnknownNoOfIntegers();
    }

    @After
    public void tearDown() throws Exception {
        SumOfUnknownNoOfIntegers obj = null;
    }

    @Test
    public void checkSum() {
        assertEquals(102,obj.checkSum("12 34 56"));
        assertEquals(10,obj.checkSum("1 8 1"));
        assertEquals(12,obj.checkSum("2 4 4 2"));
        assertEquals(0,obj.checkSum("0 0 0"));
    }
}