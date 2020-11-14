package com.learning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AssertTest {

    @Test
    public void test() {
        boolean cond = true;
        assertEquals(1,1);
        assertTrue( cond);
        assertFalse( !cond);
        assertNull( null);
        assertNotNull( cond);
        int[] expecteds = {};
        int[] actuals = {};
        assertArrayEquals(expecteds, actuals);
    }
}
