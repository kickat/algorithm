package com.rusteye.algorithm.sort;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] array = new int[] { 3, 5, 7, 9, 2, 4, 6, 8 };
		selectionSort(array); 
		System.out.println(Arrays.toString(array));
	}
	
	private static void selectionSort(int[] arr) {
		int len = arr.length;
		int minIndex, temp;
		for (int i = 0; i < len - 1; i++) {
			minIndex = i;
			for (int j = i + 1; j < len; j++) {
				if (arr[j] < arr[minIndex]) { // 寻找最小的数
					minIndex = j; // 将最小数的索引保存
				}
			}
			temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
	}
}
