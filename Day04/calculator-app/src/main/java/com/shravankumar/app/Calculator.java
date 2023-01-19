package com.shravankumar.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculator
{
    @GetMapping("/add")
    public double add(@RequestParam("a") double a, @RequestParam("b") double b)
    {
        return a+b;
    }

    @GetMapping("/sub")
    public double sub(@RequestParam("a") double a, @RequestParam("b") double b)
    {
        return a-b;
    }
    @GetMapping("/mul")
    public double multiply(@RequestParam("a") double a, @RequestParam("b") double b)
    {
        return a*b;
    }
    @GetMapping("/div")
    public double division(@RequestParam("a") double a, @RequestParam("b") double b)
    {
        return a/b;
    }
}
