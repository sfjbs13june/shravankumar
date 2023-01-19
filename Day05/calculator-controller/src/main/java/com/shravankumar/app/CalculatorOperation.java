package com.shravankumar.app;

import org.springframework.web.bind.annotation.*;

@RestController
public class CalculatorOperation {
    @GetMapping("/add")
    public long add(@RequestParam("m") long m,@RequestParam("s") long s)
    {
        return m+s;
    }

    @PostMapping("/sub")
    public long sub(@RequestParam("m") long m,@RequestParam("s") long s)
    {
        return m-s;
    }

    @PutMapping("/mul")
    public long mul(@RequestParam("m") long m,@RequestParam("s") long s)
    {
        return m*s;
    }

    @DeleteMapping("/div")
    public long div(@RequestParam("m") long m,@RequestParam("s") long s)
    {
        return m/s;
    }
}