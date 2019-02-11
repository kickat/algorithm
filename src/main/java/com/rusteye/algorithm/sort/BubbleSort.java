package com.rusteye.algorithm.sort;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] array = new int[] { 3, 5, 7, 9, 2, 4, 6, 8 };
		System.out.println(Arrays.toString(bubbleSort(array)));
	}

	public static int[] bubbleSort(int[] array) {
		if (array.length > 0) {
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array.length - i - 1; j++) {
					if (array[j + 1] < array[j]) {
						int temp = array[j + 1];
						array[j + 1] = array[j];
						array[j] = temp;
					}
				}
			}
		}
		return array;
	}
}
