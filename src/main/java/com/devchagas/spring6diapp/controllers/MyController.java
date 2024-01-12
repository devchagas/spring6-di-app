package com.devchagas.spring6diapp.controllers;

import com.devchagas.spring6diapp.services.GreetingService;
import com.devchagas.spring6diapp.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String sayHello(){
        System.out.println("Im in the controller");

        return greetingService.sayGreeting();
    }
}
