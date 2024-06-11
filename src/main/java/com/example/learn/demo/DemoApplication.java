package com.example.learn.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Collections;
import java.util.List;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);

//		List<String> listOfBean = Collections.singletonList(context.getApplicationName());
//
//		for(String str : listOfBean){
//			System.out.println("Bean : " + str);
//		}
	}

}
