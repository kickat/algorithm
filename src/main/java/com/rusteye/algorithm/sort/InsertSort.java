package com.rusteye.algorithm.sort;

import java.util.Arrays;

public class InsertSort {
	public static void main(String[] args) {
        int array[] = {3,1,5,7,2,4,9,6,8};
        insertSort(array);
        System.out.println(Arrays.toString(array));
    }
	
    public static void insertSort(int[] a) {
        int n = a.length;
        int i,j;
        for(i=1;i<n;i++){
            int temp = a[i];
            for(j=i-1;j>=0 && a[j]>temp;j--){
                // 元素后移，为插入temp做准备
                a[j+1] = a[j];
            }
            // 插入temp
            a[j+1] = temp;
        }
    }
}
