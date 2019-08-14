package com.java.linkedlist;

//一个节点
public class Node {

    //节点内容
    int data;
    //下一个节点
    Node next;

    public Node(int data){
        this.data=data;
    }

    //为节点追加节点
    public Node append(Node node){
        //当前节点
      Node currentNode=this;
      while(true){
          //取出下一个节点
         Node nextNode= currentNode.next;
         //如果下一个节点为null,表示当前节点已经是最后一个节点了
         if(nextNode==null){
         break;
         }
         //赋值给当前节点
         currentNode=nextNode;
      }
      //把需要追回的节点追加为找到的当前节点的下一个节点
        currentNode.next=node;
      return this;
    }

    //获取下一个节点
    public Node Next(){
        return this.next;
    }

    public int getData(){
        return  data;
    }

    //当前节点是否是最后一个节点
    public boolean isLast(){
        return next==null;
    }
}
