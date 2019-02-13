package com.rusteye.algorithm.sort;

import java.util.Arrays;

public class ShellSort {
	public static void main(String[] args) {
		int[] array = new int[] { 3, 5, 7, 9, 2, 4, 6, 8 };
		shellSort(array, 0, array.length-1); 
		System.out.println(Arrays.toString(array));
	}
	
	private static void shellSort(int[] arr, int start, int end) {
	    int increment = end - start + 1;    //初始化划分增量
	    int temp;
	    do {    //每次减小增量，直到increment = 1
	        increment = increment / 3 + 1;
	        for (int i = start + increment; i <= end; ++i) {    //对每个划分进行直接插入排序
	            if (arr[i - increment] > arr[i]) {
	                temp = arr[i];
	                int j = i - increment;
	                do {    //移动元素并寻找位置
	                    arr[j + increment] = arr[j];
	                    j -= increment;
	                } while (j >= start && arr[j] > temp);
	                arr[j + increment] = temp;  //插入元素
	            }
	        }
	    } while (increment > 1);
	}
}
