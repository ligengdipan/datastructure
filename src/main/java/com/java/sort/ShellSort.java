package com.java.sort;

public class ShellSort {
    int[] arr = new int[]{5, 3, 7, 9, 23, 11, 7, 0};

    //希尔排序
    public void shellSort(int[] arr) {
        //遍历所有步长
        for (int d = arr.length / 2; d > 0; d/=2) {
            //遍历所有元素
            for (int i = d; i < arr.length; i++) {
                for (int j = i - d; j >=0; j -= d) {
                    //如果当前元素大于加上步长后的元素
                    if (arr[j] > arr[j + d]) {
                        int temp = arr[j];
                        arr[j] = arr[j + d];
                        arr[j + d] = temp;
                    }
                }
            }
        }

    }
}
