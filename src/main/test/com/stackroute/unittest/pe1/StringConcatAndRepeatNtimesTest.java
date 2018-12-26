package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringConcatAndRepeatNtimesTest {

    StringConcatAndRepeatNtimes obj;
    @Before
    public void setUp() throws Exception {
        StringConcatAndRepeatNtimes obj = new StringConcatAndRepeatNtimes();
    }

    @After
    public void tearDown() throws Exception {
        StringConcatAndRepeatNtimes obj = null;
    }

    @Test
    public void repeatStr() {
        assertEquals("stackroutetete",obj.repeatStr("stackroute",2));
        assertEquals("kishlayy",obj.repeatStr("kishlay",1));
        assertEquals("lollollollol",obj.repeatStr("lol",3));
        assertEquals("clearearearear",obj.repeatStr("clear",3));
        assertEquals("ramm",obj.repeatStr("ram",1));
    }
}