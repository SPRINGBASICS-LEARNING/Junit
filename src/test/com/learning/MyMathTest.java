package com.learning;


import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyMathTest {

    @BeforeEach
    public void before() {
        System.out.println("Before");
    }

    @AfterEach
    public void after() {
        System.out.println("After");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Before-all");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("After-all");
    }


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
