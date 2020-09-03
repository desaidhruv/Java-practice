import java.util.*;
/**
 * Iterative_Preorder_Traversal
 */
public class Iterative_Preorder_Traversal {
    TreeNode root;

    public class TreeNode{
        String data;
        TreeNode left;
        TreeNode right;

        public TreeNode(String data){
            this.data = data;
        }
    }

    public void createBinaryTree(){
        TreeNode first = new TreeNode("A");
        TreeNode second = new TreeNode("B");
        TreeNode third = new TreeNode("C");
        TreeNode fourth = new TreeNode("D");
        TreeNode fifth = new TreeNode("E");
        TreeNode sixth = new TreeNode("F");
        TreeNode seventh = new TreeNode("G");

        root = first;
        first.left = second;
        first.right = third;;
        second.left = fourth;
        second.right = fifth;
        third.left = sixth;
        third.right = seventh;
    }

    public void Preorder(TreeNode root){
        if(root == null){
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode temp = stack.pop();
            System.out.print(temp.data + " ");
            if(temp.right != null){
                stack.push(temp.right);
            }
            if(temp.left != null){
                stack.push(temp.left);
            }
        }
    }

    public static void main(String[] args) {
        Iterative_Preorder_Traversal tree = new Iterative_Preorder_Traversal();
        tree.createBinaryTree();
        tree.Preorder(tree.root);
    }
}