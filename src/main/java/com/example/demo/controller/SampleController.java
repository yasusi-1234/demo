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

}
