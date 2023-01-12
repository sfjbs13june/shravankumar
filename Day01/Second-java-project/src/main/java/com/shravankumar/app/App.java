package com.shravankumar.app;

public class App
{
    public static void main( String[] args )
    {
        Greeting greeting=new Greeting();
        String hello=greeting.sayHello();
        System.out.println(hello);
        String welcome=greeting.sayWelcome();
        System.out.println(welcome);
        String bye=greeting.sayBye();
        System.out.println(bye);
    }
}