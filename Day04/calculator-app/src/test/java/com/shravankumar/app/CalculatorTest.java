package com.shravankumar.app;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    Calculator calculator = new Calculator();
    @Test
    public void testrequestAdd() {
        double a = 5.0;
        double b = 5.0;
        double expectedResult = 10.0;
        double res = calculator.add(a,b);
        Assertions.assertEquals(expectedResult,res,0.00);
    }

    @Test
    public void testrequestSub() {
        double a = 5.0;
        double b = 5.0;
        double expectedResult = 0.0;
        double res = calculator.sub(a,b);
        Assertions.assertEquals(expectedResult,res,0.00);
    }

    @Test
    public void testrequestMul()
    {
        Calculator calculator = new Calculator();
        double a = 5.0;
        double b = 5.0;
        double expectedResult = 25.0;
        double res = calculator.multiply(a,b);
        Assertions.assertEquals(expectedResult,res,0.00);
    }

    @Test
    public void testrequestDiv() {
        Calculator calculator = new Calculator();
        double a = 5.0;
        double b = 5.0;
        double expectedResult = 1.0;
        double res = calculator.division(a,b);
        Assertions.assertEquals(expectedResult,res,0.00);
    }
}