package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		
		//Binary Search logic
		
		//BinarySearch obj = new BinarySearch(new BubbleSortImpl());
		
		BinarySearch obj = context.getBean(BinarySearch.class);
		int result = obj.search(new int[] {1,5,8,9}, 9);
		
		System.out.println("Search number is: "+ result);
		
	}

}


//what are the beans 
//what are the dependancies
//component scan - 