import java.util.*; 
/**
 * Iterative_Inorder_Traversal
 */
public class Iterative_Inorder_Traversal {
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

    public void Inorder(TreeNode root){
        if(root == null){
            return;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode temp = root;
        while(!stack.isEmpty() || temp != null){
            if(temp != null){
                stack.push(temp);
                temp = temp.left;
            } else {
                temp = stack.pop();
                System.out.print(temp.data + " ");
                temp = temp.right;
            }
        }
    }

    public static void main(String[] args) {
        Iterative_Inorder_Traversal tree = new Iterative_Inorder_Traversal();

        tree.createBinarytree();
        tree.Inorder(tree.root);
    }
}