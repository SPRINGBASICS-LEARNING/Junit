package com.learning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyMathTest {

    MyMath myMath = new MyMath();
    @Test
    public void sum_with3numbers() {
        int result = myMath.sum(new int[]{1,2,3});
        assertEquals(6, result);
    }

    @Test
    public void sum_with1numbers() {
        int result = myMath.sum(new int[]{3});
        assertEquals(3, result);
    }
}
