public class Main {
    public static void main(String[] args) {
    }
    
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;

        TreeNode left_side = invertTree(root.left);
        TreeNode right_side = invertTree(root.right);

        root.left = right_side;
        root.right = left_side;

        return root;

    }
}
