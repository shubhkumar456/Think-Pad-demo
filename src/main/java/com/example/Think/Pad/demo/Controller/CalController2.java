package com.example.Think.Pad.demo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalController2 {

    @RequestMapping("/Addition")
    public int add(){
        int result = 35+70;
        return result;
    }

    @RequestMapping("/Substraction")
    public int subs(){
        int result = 1000-70;
        return result;
    }

    @RequestMapping("/Multiply")
    public int multi(){
        int result = 35*70;
        return result;
    }

    @RequestMapping("/Division")
    public int div(){
        int result = 3500/70;
        return result;
    }

    @RequestMapping("/warning")
    public void hello(){
        System.out.println("You can see me on google chrome");
    }

}
