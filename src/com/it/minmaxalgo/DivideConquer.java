package com.it.minmaxalgo;

import java.util.Arrays;

class Pair {
	int min;
	int max;
}

public class DivideConquer {
	static Pair getMinMax(int arr[], int n) {
		Pair minmax = new Pair();
		Arrays.sort(arr);
		minmax.min = arr[0];
		minmax.max = arr[n - 1];
		return minmax;
	}

	public static void main(String[] args) {
		int arr[] = { 1000, 11, 445, 1, 330, 3000 };
		int arr_size = arr.length;
		Pair minmax = getMinMax(arr, arr_size);
		System.out.println("Minimum element is " + minmax.min);
		System.out.println("Maximum element is " + minmax.max);
	}
}
