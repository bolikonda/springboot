package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class BubbleSortImpl implements SortInterface {

	public int[] sort(int[] numbers) {
		// sort algorithm
		System.out.println("Inside BubbleSort");
		return new int[] { 1, 2, 3, 4, 9 };
	}
}
