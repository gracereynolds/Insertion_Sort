package com.company;

public class Main {

    public static void main(String[] args) {
        int[] testArr = SortUtil.randArr(6);
        System.out.println("Before: " + SortUtil.toString(testArr));
        InsertSort.sort(testArr);
        System.out.println("After: " + SortUtil.toString(testArr));
    }
}
