package com.java.search;

public class LineSearch {

    public int Search(int []arr,int target) {
        //目标元素所在的下标
        int index = -1;
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index=i;
                break;
            }
        }
    return index;
    }

}
