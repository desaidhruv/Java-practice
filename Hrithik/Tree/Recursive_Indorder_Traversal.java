/**
 * Recursive_Indorder_Traversal
 */
public class Recursive_Indorder_Traversal {
    TreeNode root;

    public class TreeNode{
        String data;
        TreeNode right;
        TreeNode left;

        public TreeNode(String data){
            this.data = data;
        }
    }

    public void createBinarytree(){
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

    public void Inorder(TreeNode root) {
        if(root == null){
            return;
        }
        Inorder(root.left);
        System.out.print(root.data + " ");
        Inorder(root.right);
    }

    public static void main(String[] args) {
        Recursive_Indorder_Traversal tree = new Recursive_Indorder_Traversal();

        tree.createBinarytree();
        tree.Inorder(tree.root);
    }
}