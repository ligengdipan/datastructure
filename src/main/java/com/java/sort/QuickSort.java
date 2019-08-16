package com.java.sort;

public class QuickSort {
    int [] arr=new int[]{11,3,5,1,29,9,6,7};



    public   void quickSort(int [] arr,int start,int end ){
        if(start<end){
        //把数组中第0个数字作为标准数
        int stard=arr[start];
        //记录需要排序的下标
        int low=start;
        int high=end;
        //循环找比标准书大的数和比标准值小的数
        while(low<high){
            //右边的数字比标准数小
            while(low<high&&stard<=arr[high]){
                high--;
            }
            //使用右边的数字替换左边的数
            arr[low]=arr[high];
            //如果左边的数字比标准数小
            while(low<high&&arr[low]<=stard){
                low++;
            }
            arr[high]=arr[low];
        }
        //把标准数赋给低所在的位置的元素
        arr[low]=stard;
        //处理所有的小的数字
        quickSort(arr,start,low);
        //处理所有的大的数字
        quickSort(arr,low+1,end);
        }
    }

}
