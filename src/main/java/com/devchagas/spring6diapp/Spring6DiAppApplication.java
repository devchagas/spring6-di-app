package com.devchagas.spring6diapp;

import com.devchagas.spring6diapp.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring6DiAppApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Spring6DiAppApplication.class, args);

		MyController myController = context.getBean(MyController.class);

		System.out.println("In Main Method");
		System.out.println(myController.sayHello());
	}

}
