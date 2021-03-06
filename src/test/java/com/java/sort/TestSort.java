package com.java.sort;

import org.junit.Test;

import java.util.Arrays;

public class TestSort {

    /**
     * 快速排序测试
     */
    @Test
    public void QuickSortTest(){
        QuickSort qs=new QuickSort();
        int [] arr=new int[]{11,3,5,1,29,9,6,7};
        qs.quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 插入排序
     */
    @Test
    public void InserSortTest(){
        int [] arr=new int [] {5,3,7,9,23,11,7,0};
        InsertSort is=new InsertSort();
        is.insertSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    /**
     * 希尔排序
     */
    @Test
    public void ShellSortTest(){
        int [] arr=new int [] {5,3,7,9,23,11,7,0};
        ShellSort ss=new ShellSort();
        ss.shellSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 归并排序
     */
    @Test
    public void MergeSortTest(){
        int [] arr=new int [] {99,5,3,7,9,23,11,133,0};
        MergeSort ms=new MergeSort();
        ms.mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }


    //基数排序
    @Test
    public void RadixSortTest(){
        int [] arr=new int []{23,119,23,334,78,229,45,237,998,12};
        RadixSort rs=new RadixSort();
        rs.radixSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 基于队列的基数排序
     */
    @Test
    public void RadixQueueSortTest(){
        int [] arr=new int []{23,119,23,334,78,229,45,237,998,12};
        RadixQueueSort rqs=new RadixQueueSort();
                rqs.radixSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
