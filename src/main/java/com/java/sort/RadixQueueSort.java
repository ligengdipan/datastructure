package com.java.sort;

import com.java.queue.Queue;

public class RadixQueueSort {
    int [] arr=new int []{23,119,23,334,78,229,45,237,998,12};

    public void radixSort(int [] arr){
        //存储数组中最大的数字
        int max=Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        //计算最大数字是几位数
        int maxLength=(max+"").length();
        //用于临时存储数据的各数组
        Queue [] temp=new Queue[10];
        for (int i = 0; i <temp.length ; i++) {
            temp[i]=new Queue();
        }
        //根据最大长度的数决定比较的次数
        for (int i = 0,n=1; i <maxLength ; i++,n*=10) {
            //把每一个数字分别计算余数
            for (int j = 0; j <arr.length ; j++) {
              int ys=  arr[j]/n%10;
              //把当前遍历的数据存放到队列中
              temp[ys].add(arr[j]);
            }

            //记录取得元素需要放的位置
            int index=0;
            //把所有队列中的数字都取出来
            for (int k = 0; k <temp.length ; k++) {
                //循环取出元素
                    while(!temp[k].isEmpty()){
                        arr[index]=temp[k].poll();
                        //记录下一个位置
                        index++;
                    }
                }
            }

        }
    }

