package com.rusteye.algorithm.sort;

import java.util.Arrays;

public class CountingSort {
	
	public static void main(String[] args) {
		int[] array = new int[] { 3, 5, 7, 9, 2, 4, 6, 8 };
		countingSort(array, 9); 
		System.out.println(Arrays.toString(array));
	}
	
	public static void countingSort(int[] arr, int maxValue) {
		int[] bucket = new int[maxValue + 1];
		int sortedIndex = 0;
		int arrLen = arr.length;
		int bucketLen = maxValue + 1;

		for (int i = 0; i < arrLen; i++) {
			bucket[arr[i]]++;
		}

		for (int j = 0; j < bucketLen; j++) {
			while (bucket[j] > 0) {
				arr[sortedIndex++] = j;
				bucket[j]--;
			}
		}
	}
}
