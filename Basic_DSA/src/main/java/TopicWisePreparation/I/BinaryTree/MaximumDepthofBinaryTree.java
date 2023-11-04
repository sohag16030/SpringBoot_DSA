package TopicWisePreparation.I.BinaryTree;

public class MaximumDepthofBinaryTree {
    public static void main(String[] args) {
       // root = {3, 9, 20, null, null, 15, 7};
        maxDepth(new TreeNode(3));
    }

    public static int maxDepth(TreeNode root) {
        if (root == null) return 0;
        else return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
