package com.shravankumar.app;


import junit.framework.TestCase;
import junit.framework.Assert;




public class AppTest extends TestCase
{
    public void testSayHello(){
        String expectedResult= "Hello from greeting";
        Greeting greeting =new Greeting();
        String result= greeting.sayHello();
        Assert.assertEquals(expectedResult,result);
    }

    public void testSayWelcome(){
        String expectedResult= "Welcome from greeting";
        Greeting greeting =new Greeting();
        String result= greeting.sayWelcome();
        Assert.assertEquals(expectedResult,result);
    }

    public void testSayBye(){
        String expectedResult= "Bye from greeting";
        Greeting greeting =new Greeting();
        String result= greeting.sayBye();
        Assert.assertEquals(expectedResult,result);
    }
}