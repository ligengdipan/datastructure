package com.java.tree;

import org.junit.Test;

public class TreeTest {


    /**
     * 创建一个二叉树
     */
    @Test
    public void TestBinaryTree(){
        //创建一棵树
        BinaryTree binTree=new BinaryTree();
        //创建一个根节点
        TreeNode root=new TreeNode(1);
        //把根节点赋给树
        binTree.setRoot(root);
        //创建一个左节点
        TreeNode rootl=new TreeNode(2);
        //把新创建的节点设置为根节点的子节点
        root.setLeftNode(rootl);
        //创建一个右节点
        TreeNode rootR=new TreeNode(3);
        //把新创建的节点设置为根节点的子节点
        root.setRightNode(rootR);
        //为第二层的左节点创建两个子节点
        rootl.setLeftNode(new TreeNode(4));
        rootl.setRightNode(new TreeNode(5));
        //为第二层的右节点创建两个子节点
        rootR.setLeftNode(new TreeNode(6));
        rootR.setRightNode(new TreeNode(7));
       // binTree.frontShow();

        //查找
        TreeNode tn=binTree.frontSearch(5);
       System.out.println(tn.value);
        // binTree.midShow();
        System.out.println("--------------------------------------");
       // binTree.afterShow();
        System.out.println("删除");
        binTree.frontShow();
        binTree.delete(1);
        System.out.println("--------------------------------------");
        binTree.frontShow();


    }
}

