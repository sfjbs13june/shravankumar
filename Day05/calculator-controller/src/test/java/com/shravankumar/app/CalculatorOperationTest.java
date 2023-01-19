package com.shravankumar.app;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorOperationTest
{
    CalculatorOperation co = new CalculatorOperation();
    @Test
    public void CalculatorOperationAdd()
    {
        long m = (long)7.0;
        long s = (long)8.0;
        long expected = 15 ;
        long res = co.add(m,s);
        Assertions.assertEquals(expected,res);
    }

    @Test
    public void CalculatorOperationSub()
    {
        long m = (long)10.0;
        long s = (long)2.0;
        long expected = 8;
        long res = co.sub(m,s);
        Assertions.assertEquals(expected,res);
    }

    @Test
    public void CalculatorOperationMul()
    {
        long m = (long) 10.0;
        long s = (long) 6.0;
        long expected = 60;
        long res = co.mul(m,s);
        Assertions.assertEquals(expected,res);
    }

    @Test
    public void CalculatorOperationDiv()
    {
        long m = (long)18.0;
        long s = (long)3.0;
        long expected = 6;
        long res = co.div(m,s);
        Assertions.assertEquals(expected,res);
    }
}