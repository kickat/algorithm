package com.rusteye.algorithm.sort;

import java.util.Arrays;

public class RadixSort {
	public static void main(String[] args) {
		int[] array = new int[] { 3, 35, 7, 29, 2, 14, 6, 118 };
		radixSort(array, 3); 
		System.out.println(Arrays.toString(array));
	}
	
	public static void radixSort(int[] data, int max) {// max为所有数字中最大的位数
		int[][] bucket = new int[10][data.length];// 这是二维数组组成的桶
		int[] countor = new int[10];// 此数组用来记录0-9每个桶中的数字个数，计数器
		int k = 0;// k用来记录原数组的元素位置
		int n = 1;// 用来计算不同位数的相应位置上的值
		int digit = 1;
		while (digit <= max) {
			for (int i = 0; i < data.length; i++) {
				int index = ((data[i] / n) % 10);// 得出相应位置（如个位、十位）上的数字
				bucket[index][countor[index]] = data[i];// 取出来放到桶里
				countor[index]++;// 相应的桶中的容量加1
			}
			for (int i = 0; i < 10; i++) {// 从桶中依次收集数据
				if (countor[i] != 0) {// 各个桶不为空时收集
					for (int j = 0; j < countor[i]; j++) {
						data[k] = bucket[i][j];
						k++;
					}
				}
				countor[i] = 0;// 相应桶中的数据已经回收完，相应计数器归0
			}
			digit++;// 位数向右移动
			n *= 10;
			k = 0;
		}
	}
}
