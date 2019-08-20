package com.java.tree;

public class BinaryTree {

    TreeNode root;

    //设置跟节点
    public void setRoot(TreeNode root){
        this.root=root;
    }

    //获取跟节点
    public TreeNode getRoot(TreeNode root){
        return root;
    }

    public void frontShow(){
        if(root!=null) {
            root.frontShow();
        }
    }


    public void midShow() {
        root.midShow();
    }

    public void afterShow() {
        root.afterShow();
    }

    public TreeNode frontSearch(int i) {
       return  root.frontSearch(i);
    }

    public void delete(int i) {
        if(root.value==i){
            root=null;
        }else{
           root.delete(i);
        }
    }
}
