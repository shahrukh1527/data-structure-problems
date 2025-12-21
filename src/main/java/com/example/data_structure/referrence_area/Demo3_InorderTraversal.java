package com.example.data_structure.referrence_area;

class TreeNode{
    public int val;
    public TreeNode left;
    public TreeNode right;
    
    public TreeNode(int x){
        this.val =x;
        left =null;
        right=null;
    }
}
public class Demo3_InorderTraversal {
    public static void inOrderTraversal(TreeNode root){
        if(root==null){
            return;
        }

        inOrderTraversal(root.left);
        System.out.print(root.val + " -> ");
        inOrderTraversal(root.right);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        root.left =new TreeNode(2);
        root.right =new TreeNode(3);

        TreeNode leftNode = root.left;
        TreeNode rightNode = root.right;

        leftNode.left = new TreeNode(4);
        leftNode.right = new TreeNode(5);

        rightNode.right = new TreeNode(6);

        inOrderTraversal(root);

    }
}
