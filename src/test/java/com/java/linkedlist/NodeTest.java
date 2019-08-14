package com.java.linkedlist;

import org.junit.Test;

public class NodeTest {

    @Test
    public void TestNode(){
        Node n1=new Node(1);
        n1.append(new Node(2));
        System.out.println(n1.Next().getData());
        System.out.println(n1.Next().isLast());
    }


}
