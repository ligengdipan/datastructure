package com.java.queue;

import org.junit.Test;

public class TestQueue {


    @Test
    public void queueTest(){
        Queue my=new Queue();
        my.add(3);
        my.add(34);
        my.add(23);
        System.out.println(my.poll());
        my.add(6);
        System.out.println(my.poll());
        System.out.println(my.poll());
        System.out.println(my.poll());
    }
}
