package com.example.helloworldwebsite;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller
{
    @GetMapping("/")
    public String Index()
    {
        return "Index";
    }
}