package com.rusteye.algorithm.sort;

import java.util.Arrays;

public class HeapSort {
	public static void main(String[] args) {
		int[] array = new int[] { 3, 5, 7, 9, 2, 4, 6, 8 };
		heapSort(array); 
		System.out.println(Arrays.toString(array));
	}
	
	static int len; // 因为声明的多个函数都需要数据长度，所以把len设置成为全局变量

	private static void buildMaxHeap(int[] arr) { // 建立大顶堆
		len = arr.length;
		for (int i = len / 2; i >= 0; i--) {
			heapify(arr, i);
		}
	}

	private static void heapify(int[] arr, int i) { // 堆调整
		int left = 2 * i + 1, right = 2 * i + 2, largest = i;

		if (left < len && arr[left] > arr[largest]) {
			largest = left;
		}

		if (right < len && arr[right] > arr[largest]) {
			largest = right;
		}

		if (largest != i) {
			swap(arr, i, largest);
			heapify(arr, largest);
		}
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	private static void heapSort(int[] arr) {
		buildMaxHeap(arr);

		for (int i = arr.length - 1; i > 0; i--) {
			swap(arr, 0, i);
			len--;
			heapify(arr, 0);
		}
	}
}
