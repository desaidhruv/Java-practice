/**
 * Preorder_Traversal
 * reference : https://www.youtube.com/watch?v=R4V4n-waxn4&list=PL6Zs6LgrJj3tOYS-E97QNN1kC9-ZXr4Q3&index=3
 */
public class Preorder_Traversal {
    TreeNode root;

    public class TreeNode{
        String data;
        TreeNode left;
        TreeNode right;

        public TreeNode(String data) {
            this.data = data;
        }
    }

    public void createBinaryTree(){
        TreeNode first = new TreeNode("A");
        TreeNode second = new TreeNode("B");
        TreeNode third = new TreeNode("C");
        TreeNode fourth = new TreeNode("D");
        TreeNode fifth = new TreeNode("E");

        root = first;
        first.left = second;
        first.right = third;;
        second.left = fourth;
        second.right = fifth;
    }

    public void preOrder(TreeNode root) {
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        Preorder_Traversal tree = new Preorder_Traversal();

        tree.createBinaryTree();
        tree.preOrder(tree.root);
    }
}