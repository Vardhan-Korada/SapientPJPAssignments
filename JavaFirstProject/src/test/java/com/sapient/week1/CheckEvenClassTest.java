package com.sapient.week1;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertTrue;


public class CheckEvenClassTest {
    private CheckEven checkEven;

    @Before
    public void setup(){
        checkEven = new CheckEven();
    }

    @Test
    public void testEvenNumber(){
        Boolean ans = checkEven.check(4);
        assertTrue(ans==true);
    }
    @Test
    public void testOddNumber(){
        Boolean ans = checkEven.check(5);
        assertTrue(ans==false);
    }
    @Test
    public void testZeroNumber(){
        Boolean ans = checkEven.check(0);
        assertTrue(ans==true);
    }
    @Test
    public void testLargeNumber(){
        Boolean ans = checkEven.check(6988944);
        assertTrue(ans==true);
    }
}