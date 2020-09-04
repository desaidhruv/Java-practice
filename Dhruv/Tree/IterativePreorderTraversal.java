package Tree;

import java.util.*;

public class IterativePreorderTraversal {
    public TreeNode root;

    public class TreeNode {
        public int data; // Generic type.
        public TreeNode right;
        public TreeNode left;
        public TreeNode(int data) {
            this.data = data;
        }
    }
    public void CreateBinaryTree() {
        TreeNode first = new TreeNode(5);
        TreeNode second = new TreeNode(15);
        TreeNode third = new TreeNode(25);
        TreeNode fourth = new TreeNode(35);
        TreeNode fifth = new TreeNode(45);

        // In order to store these five nodes into the binary tree.
        root = first; // root --> first
        first.left = second;
        first.right = third; // second <-- first --> third
        third.left = fourth;
        third.right = fifth;
    }
    public void IterativePreorder() {
        if( root == null ) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            System.out.println(temp.data);
            if(temp.right != null) {
                stack.push(temp.right);
            }
            if(temp.left != null) {
                stack.push(temp.left);
            }
        }
        
    }
    public static void main(String[] args) {
        IterativePreorderTraversal it = new IterativePreorderTraversal();
        it.CreateBinaryTree();
        it.IterativePreorder();
    }
}
