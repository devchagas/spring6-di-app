package com.devchagas.spring6diapp.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello(){
        System.out.println("Im in the controller");

        return "Hello Everyone";
    }
}
