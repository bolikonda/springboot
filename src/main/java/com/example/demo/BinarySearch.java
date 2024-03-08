package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component //this bean will be created and managed spring framework
public class BinarySearch {

	/*public int search(int[] numbers, int a)
	{
		// sort the elements based on algorithm (Bubble sort, Quick sort)
		//BubbleSortImpl sortObj = new BubbleSortImpl();
		QuickSortImpl sortObj = new QuickSortImpl();
		int[] sortedNums = sortObj.sort(numbers);
		
		//search logic goes here
		
		return 10;
	}*/
	
	@Autowired
	SortInterface sortObj;
	
	/*public BinarySearch(SortInterface sortObj) {
		super();
		this.sortObj = sortObj;
	}*/

	public int search(int[] numbers, int a)
	{
		// sort the elements based on algorithm (Bubble sort, Quick sort)
		//BubbleSortImpl sortObj = new BubbleSortImpl();
		int[] sortedNums = sortObj.sort(numbers);
		
		//search logic goes here
		
		return 10;
	}
}
