package com.devchagas.spring6diapp.controllers;

import com.devchagas.spring6diapp.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
