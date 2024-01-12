package com.devchagas.spring6diapp;

import com.devchagas.spring6diapp.controllers.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class Spring6DiAppApplicationTests {

	//Method 1
	@Autowired
	ApplicationContext applicationContext;

	//Method 1
	@Test
	void testGetControllerFromContext() {
		MyController myController = applicationContext.getBean(MyController.class);

		System.out.println(myController.sayHello());
	}

	//Method 2
	@Autowired
	MyController myController;

	//Method 2
	@Test
	void testAutowireOfController() {
		System.out.println(myController.sayHello());
	}

	@Test
	void contextLoads() {
	}

}
