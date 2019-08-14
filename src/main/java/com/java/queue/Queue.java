package com.java.queue;

public class Queue {

    int [] elements;

    public Queue(){
        elements=new int [0];
    }

    public void add(int element){
        //创建一个新的数组
        int [] newArr=new int[elements.length+1];
        //把原数组中的元素复制到新数组中
        for (int i = 0; i <elements.length ; i++) {

            newArr[i]=elements[i];
        }
        //把添加的元素放入新数组中
        newArr[elements.length]=element;
        //使用新的数据替换旧数组
        elements=newArr;
    }

    //出队
    public void poll(){
        //把数组总第0个元素取出
      int element=elements[0];
        //创建一个新数组
      int [] newArr=new int[elements.length-1];

        for (int i = newArr.length; i <newArr.length ; i++) {
          newArr[i]=elements[i];
        }
        //替换数组
        elements=newArr;

    }

}
