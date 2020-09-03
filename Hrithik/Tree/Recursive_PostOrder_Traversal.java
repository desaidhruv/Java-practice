/**
 * Recursive_PostOrder_Traversal
 */
public class Recursive_PostOrder_Traversal {
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

    public void PostOrder(TreeNode root){
        if(root == null){
            return;
        }
        PostOrder(root.left);
        PostOrder(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {
        Recursive_PostOrder_Traversal tree = new Recursive_PostOrder_Traversal();
        tree.createBinaryTree();
        tree.PostOrder(tree.root);
    }
}