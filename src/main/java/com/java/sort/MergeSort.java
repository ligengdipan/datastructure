package com.java.sort;

public class MergeSort {

    //归并排序
    public void merge(int [] arr,int low,int minddle,int high){
        //用于存储归并后的临时数据
        int [] temp=new int [high-low+1];
        //用于记录第一个数据中需要遍历的下标。
        int i=low;
        //记录第二个数组中遍历的下表
        int j=minddle+1;
        //用于记录在临时数组中存放的下表
        int index=0;
        //遍历两个数组取出小的数字，放入临时数组中
        while(i<minddle&&j<=high){
            if(arr[i]<=arr[j]){
                //把小的数据放入临时数组中
                temp[index]=arr[i];
                //让下标向后移
                i++;
            }else{
                temp[index]=arr[j];
                j++;
            }
            index++;
        }
        //处理多余的数据
        while(j<=high){
            temp[index]=arr[j];
            j++;
            index++;
        }
        while(i<=minddle){
            temp[index]=arr[i];
            i++;
            index++;
        }
        //把临时数组中的数据重新存入原数组中
        for (int k = 0; k <temp.length ; k++) {
           arr[k+low]=temp[k];
        }

    }

    public void mergeSort(int [] arr,int low,int high){
        int minddle=(high+low)/2;
        if(low<high){
        //处理左边
        mergeSort(arr,low,minddle);
        //处理右边
        mergeSort(arr,minddle+1,high);
        //归并
        merge(arr,low,minddle,high);
        }

    }

}
