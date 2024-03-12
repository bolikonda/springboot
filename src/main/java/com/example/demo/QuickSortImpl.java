package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
//@Qualifier("quick")
public class QuickSortImpl implements SortInterface{

	public int[] sort(int[] numbers)
	{
		//sort algorithm
		System.out.println("Inside Quicksort");
		return new int[] {1,2,3,4,9}; 
	}
}
