package com.java.stack;

import org.junit.Test;

public class StackTest {

    @Test
    public void TestStackTest(){
      Stack sk=new Stack();
      sk.push(1);
      sk.push(9);
      System.out.println("出栈---------"+sk.pop());

    }
}
