package com.company;

public class InsertSort {
    public static void sort(int[] arr) {
        int temp;
        for(int i = 1; i < arr.length; i++) {
            temp = arr[i];
            for(int j = i-1; j >= 0; j--) {
                if(temp < arr[j]) {
                    SortUtil.swap(arr, j, j+1);
                }
            }
        }
    }
}
