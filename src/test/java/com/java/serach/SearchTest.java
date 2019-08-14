package com.java.serach;

import com.java.search.BinarySearch;
import com.java.search.LineSearch;
import org.junit.Test;

import java.util.Arrays;

public class SearchTest {
    //目标数组
    int [] arr=new int[]{1,2,3,4,5,6,7,8,9};

    /**
     * 二分查找
     */
    @Test
    public void testBinarySearch(){
        BinarySearch bSerach=new BinarySearch();
        int index=bSerach.Search(arr,8);
        System.out.println("二分查找---------"+index);
    }

    /**
     * 线性查找
     *
     */
    @Test
    public void testLineSearch() {
        LineSearch lSerach = new LineSearch();
        int index = lSerach.Search(arr, 5);
        System.out.println("线性查找---------" + index);
    }


}
