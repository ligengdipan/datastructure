package com.java.tree;

public class TreeNode {
    //节点的权
    int value;
    //左儿子
    TreeNode leftNode;
    //右儿子
    TreeNode rightNode;

    public TreeNode(int value) {
        this.value = value;
    }

    //设置左儿子
    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    //设置右儿子
    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }


    public void frontShow() {
        //先遍历当前节点的内容
        System.out.println(value);
        //左节点
        if (leftNode != null) {
            leftNode.frontShow();
        }
        //右节点
        if (rightNode != null) {
            rightNode.frontShow();
        }
    }

    public void midShow() {
        //左子节点
        if (leftNode != null) {
            leftNode.midShow();
        }
        System.out.println(value);
        //右子节点
        if (rightNode != null) {
            rightNode.midShow();
        }
    }

    public void afterShow() {
        //左子节点
        if (leftNode != null) {
            leftNode.afterShow();
        }

        //右子节点
        if (rightNode != null) {
            rightNode.afterShow();
        }
        System.out.println(value);

    }

    /**
     * 前查找
     *
     * @param i
     * @return
     */
    public TreeNode frontSearch(int i) {
        TreeNode target = null;
        //对比当前节点的值
        if (this.value == i) {
            return this;
            //当前节点的值不是要查找的节点
        } else {
            //查找左儿子
            if (leftNode != null) {
                //有可能可以查到，也可能查不到，target还是一个null
                target = leftNode.frontSearch(i);
            }
            //如果不为空，说明在左儿子中已经找到
            if (target != null) {
                return target;
            }
            //查找右儿子
            if (rightNode != null) {
                target = rightNode.frontSearch(i);
            }
        }
        return target;
    }

    //删除一颗子树
    public void delete(int i) {
         TreeNode parent=this;
         //判断左儿子
         if(parent.leftNode!=null&&parent.leftNode.value==i){
             parent.leftNode=null;

         }
         //判断右儿子
         if(parent.rightNode!=null&&parent.rightNode.value==i){
             parent.rightNode=null;
         }

         parent=leftNode;
         if(parent!=null){
             parent.delete(i);
         }

         parent=rightNode;
         if(parent!=null){
             parent.delete(i);
         }


    }
}
