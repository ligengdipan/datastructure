package com.java.search;

public class BinarySearch {

    public int Search(int []arr,int target){

        //记录开始位置
        int begin=0;
        //记录结束位置
        int end=arr.length-1;
        //记录中间位置
        int mid=(begin+end)/2;

        while (true){
            //如果开始位置和结束位置重合,就表示没有这个元素
            if(begin>=end){
                return  -1;
            }
            //判断中间元素是不是要朝招的元素
            if(target==arr[mid]){
                return mid;

                //中间这个元素不是要查找的元素
            }else{
                //判断中间这个元素是不是比目标元素大
                if(arr[mid]>target){
                    //把结束位置调整到中间位置的前一个位置。
                    end=mid-1;
                }else{
                    begin=mid+1;
                }
                mid=(begin+end)/2;

            }

        }

    }
}
