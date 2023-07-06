package com.it.sorting;
import  com.it.commonmethods.*;
public class BubbleSOrt {

	public static void main(String[] args) {
		int arr[] = { 7, 8, 32, 2, 1 };

		// bubble sort
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {

					// swap
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}
			}
		}
		
		GenericeMethods.printArray(arr);

	}
}
