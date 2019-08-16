package com.java.linkedlist;

import com.sun.xml.internal.ws.developer.UsesJAXBContext;
import org.junit.Test;

public class NodeTest {

    @Test
    public void TestNode(){
        Node n1=new Node(1);
        Node n2=new Node(2);
        Node n3=new Node(3);
        Node n4=new Node(4);
        n1.append(n2).append(n3).append(n4);

        System.out.println(n1.Next().getData());
        System.out.println(n1.Next().isLast());
//        n1.removeNext();
//        n1.show();
        Node n5=new Node(5);
        n1.after(n5);
        n1.show();
    }

    @Test
    public void TestLoopNode(){
        LoopNode ln1=new LoopNode(1);
        LoopNode ln2=new LoopNode(2);
        LoopNode ln3=new LoopNode(3);
        LoopNode ln4=new LoopNode(4);
        LoopNode ln5=new LoopNode(5);
        ln1.after(ln2);
        System.out.println(ln1.Next().getData());
        System.out.println(ln2.Next().getData());
    }

    //双向循环链表
    @Test
    public void TestDoubleNode(){


    }

    //斐波那契数列1 1 2 3 5 8 13
    @Test
    public void TestFBNQSL(){

        System.out.println(fbnqsl(3));
    }

    public static  int  fbnqsl(int i){
        if(i==1||i==2){
            return i;
        }else{
          return  fbnqsl(i-1)+fbnqsl(i-2);
        }
    }


    //汉诺塔问题
    @Test
    public void TestHNTWT(){


    }

    public static void hannuo(int n,char from,char in,char to){
       if(n==1){

       }

    }




}
