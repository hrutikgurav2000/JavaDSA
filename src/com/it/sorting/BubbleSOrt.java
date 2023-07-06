package com.it.sorting;

import com.it.commonmethods.*;

public class BubbleSOrt {

	// bubble sort descending
	public static void bubbleAscending(int arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {

					System.out.println("---------------------------------");
					System.out.println("before swapping");
					System.out.println("value of i" + i);
					System.out.println("value of j" + j);
					System.out.println(arr[i] + "value of arr[i] ");
					System.out.println(arr[j] + "value of arr[j] ");
					System.out.println(arr[j + 1] + "value of arr[j+1] ");
					// swap
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

					System.out.println("after swapping");

					System.out.println(arr[i] + "value of arr[i] ");
					System.out.println(arr[j] + "value of arr[j] ");
					System.out.println(arr[j + 1] + "value of arr[j+1] ");

					System.out.println("---------------------------------");

				}
			}
		}

		GenericeMethods.printArray(arr);

	}

	public static void bubbleDescending(int arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] < arr[j + 1]) {

					System.out.println("---------------------------------");
					System.out.println("before swapping");
					System.out.println("value of i" + i);
					System.out.println("value of j" + j);
					System.out.println(arr[i] + "value of arr[i] ");
					System.out.println(arr[j] + "value of arr[j] ");
					System.out.println(arr[j + 1] + "value of arr[j+1] ");
					// swap
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

					System.out.println("after swapping");

					System.out.println(arr[i] + "value of arr[i] ");
					System.out.println(arr[j] + "value of arr[j] ");
					System.out.println(arr[j + 1] + "value of arr[j+1] ");

					System.out.println("---------------------------------");

				}
			}
		}

		GenericeMethods.printArray(arr);

	}
	
	public static void main(String[] args) {
		int arr[] = { 7, 8, 32, 2, 1 };
		//bubbleAscending(arr);
		
		bubbleDescending(arr);

	}
}
