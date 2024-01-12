package com.devchagas.spring6diapp.controllers;

import com.devchagas.spring6diapp.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SetterInjectedControllerTest {

    @Autowired
    public SetterInjectedController setterInjectedController;

//    @BeforeEach
//    void setUp() {
//        setterInjectedController = new SetterInjectedController();
//        //Need to instanciate or get error
//        setterInjectedController.setGreetingService(new GreetingServiceImpl());
//    }

    @Test
    void sayHello() {
        System.out.println(setterInjectedController.sayHello());
    }
}