package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TomAndJerryTest {
    TomAndJerry obj;
    @Before
    public void setUp() throws Exception {
        TomAndJerry obj = new TomAndJerry();
    }

    @After
    public void tearDown() throws Exception {
        TomAndJerry obj = null;
    }

    @Test
    public void checkTomJerry() {
        int expectedRes = 0;
        int actualRes = obj.checkTomJerry(24);
        assertEquals(expectedRes, actualRes);
    }

    @Test
    public void checkTomJerryNegative() {
        int expectedRes = 1;
        int actualRes = obj.checkTomJerry(27);
        assertEquals(expectedRes, actualRes);
    }

    @Test
    public void checkTomJerryOutOfRange() {
        int expectedRes1 = 2;
        int actualRes1 = obj.checkTomJerry(6);
        assertEquals(expectedRes1, actualRes1);

        int expectedRes2 = 2;
        int actualRes2 = obj.checkTomJerry(31);
        assertEquals(expectedRes2, actualRes2);
    }
}