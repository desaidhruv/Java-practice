package Tree;
// Three steps to traverse through the tree in preorder.
// Visit the root node.
// Traverse the left subtree in Preorder Traversal
// Traverse the right subtree in Preorder Traversal
// VLR
public class PreorderTraversal {
    private TreeNode root;

    public class TreeNode {
        private int data; // Generic type.
        private TreeNode right;
        private TreeNode left;
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
    public void preOrder(TreeNode root) {
        if (root == null) { // Base Case
            return;
        }
        System.out.print(root.data + " " );
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args) {
        PreorderTraversal pt = new PreorderTraversal();
        pt.CreateBinaryTree();
        pt.preOrder(pt.root);
    }
}
