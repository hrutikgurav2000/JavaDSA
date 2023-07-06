package com.it.search;

public class BinarySearch {
	public static int Binary(int arr[], int i, int j, int element) {
		if (j >= 1) {
			int mid = (i + j) / 2;

			if (arr[mid] == element) {
				return mid;
			} else {
				if (arr[mid] > element) {
					return Binary(arr, i, mid - 1, element);
				} else {
					return Binary(arr, mid + 1, j, element);
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int i = 0;
		int j = arr.length;
		int element = 7;

		int index = Binary(arr, i, j, element);
		if (index == -1) {
			System.out.println("Element not present in  array");
		} else {
			System.out.println("Element present at index:" + index);
		}

	}
}
