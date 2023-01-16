package com.shravankumar.app;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class GreetingControllerTest {
    GreetingController greetingController=new GreetingController();
    @Test
    public void testSayGreet(){
        String expectedResult="greet from app";
        String result= greetingController.sayGreet();
        Assert.assertEquals(expectedResult,result);
    }
    @Test
    public void testSayWelcome(){
        String expectedResult="welcome from app";
        String result= greetingController.sayWelcome();
        Assert.assertEquals(expectedResult,result);
    }
    @Test
    public void testSayHi(){
        String expectedResult="hi from app";
        String result= greetingController.sayHi();
        Assert.assertEquals(expectedResult,result);
    }
    @Test
    public void testSayThanks(){
        String expectedResult="thanks from app";
        String result= greetingController.sayThanks();
        Assert.assertEquals(expectedResult,result);
    }
}