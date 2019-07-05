package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class SandwichController {
    @GetMapping("/")
    public String  showForm(){
        return "save";
    }
    @PostMapping("/save")
    public ModelAndView saveForm(@RequestParam("condiment") String[] name){

        if (name!=null){
            ModelAndView modelAndView = new ModelAndView("save");
            modelAndView.addObject("condiments", name);
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("save");
            modelAndView.addObject("message", "Bạn không nhập gì cả");
            return modelAndView;
        }

    }
}
