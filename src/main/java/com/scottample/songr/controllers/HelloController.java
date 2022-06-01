package com.scottample.songr.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class HelloController {
    @GetMapping("hello")
    public String HelloWorld() {
        return "hello";
    }
    @GetMapping("capitalize/{word}")
    @ResponseBody
    public String TheName(@PathVariable String word){
        return word.toUpperCase();
    }
}
