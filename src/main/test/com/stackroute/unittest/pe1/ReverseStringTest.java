package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseStringTest {
    ReverseString obj;
    @Before
    public void setUp() throws Exception {
        ReverseString obj = new ReverseString();
    }

    @After
    public void tearDown() throws Exception {
        ReverseString obj = null;
    }

    @Test
    public void revStr() {
        assertEquals("kishlay",obj.revStr("yalhsik"));
        assertEquals("",obj.revStr(""));
        assertEquals("APJ",obj.revStr("JPA"));
        assertEquals("HAAH",obj.revStr("HAAH"));
    }
}