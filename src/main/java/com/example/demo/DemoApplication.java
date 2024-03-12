package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		
		//Binary Search logic
		
		//BinarySearch obj = new BinarySearch(new BubbleSortImpl());
		
		BinarySearch obj1 = context.getBean(BinarySearch.class);
		int result = obj1.search(new int[] {1,5,8,9}, 9);
		System.out.println("Search number is: "+ result);
		
		BinarySearch obj2 = context.getBean(BinarySearch.class);
		
		System.out.println("obj1 "+ obj1);
		System.out.println("obj2 "+ obj2);
		
	}

}


//what are the beans 
//what are the dependancies
//component scan - 

//Bean scopes
//singleton
// prototype
//Request 
//session
