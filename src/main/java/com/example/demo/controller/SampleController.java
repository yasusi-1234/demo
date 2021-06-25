package com.example.demo.controller;

import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("sample")
public class SampleController {

    @GetMapping
    public String sampleGet(Model model){
        model.addAttribute("hello","Hello World");
        return "index";
    }

    @GetMapping("2")
    public String sampleGet2(Model model){
        model.addAttribute("hello", "Hello World2!!!");
        return "index";
    }

    @GetMapping("3")
    public String sampleGet3(Model model){
        model.addAttribute("hello", "Hello World3!!!");
        return "index";
    }

}
