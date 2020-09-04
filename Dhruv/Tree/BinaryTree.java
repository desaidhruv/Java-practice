package Tree;

public class BinaryTree {
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
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.CreateBinaryTree();
    }
}
