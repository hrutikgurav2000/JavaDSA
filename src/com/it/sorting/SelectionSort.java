package com.it.sorting;
import com.it.commonmethods.*;
public class SelectionSort {

	public static void selectionAscending(int arr[]) {

		for (int i = 0; i < arr.length - 1; i++) {
			int smallest = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[smallest] > arr[j]) {
					smallest = j;
				}
			}

			int temp = arr[smallest];
			arr[smallest] = arr[i];
			arr[i] = temp;
		}
		GenericeMethods.printArray(arr);
		
	}

	public static void main(String[] args) {
		int arr[] = { 1,9,8,2,48,69,2,1};
		selectionAscending(arr);
	}
}
