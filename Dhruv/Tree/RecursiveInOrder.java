package Tree;
// Three steps to traverse through the tree in inOrder.
// Traverse the left subtree in inOrder Traversal
// Visit the root node.
// Traverse the right subtree in inOrder Traversal
// LVR
public class RecursiveInOrder {
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
    public void inOrder(TreeNode root) {
        if(root == null) { // Base Case for coming out of recursion.
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }
    public static void main(String[] args) {
        RecursiveInOrder rt = new RecursiveInOrder();
        rt.CreateBinaryTree();
        rt.inOrder(rt.root);
    }
}
