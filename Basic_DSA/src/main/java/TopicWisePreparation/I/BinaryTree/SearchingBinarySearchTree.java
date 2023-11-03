package TopicWisePreparation.I.BinaryTree;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }
    TreeNode(int val) {
        this.val = val;
    }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class SearchingBinarySearchTree {
    public static void main(String[] args) {
        int[] root = {4, 2, 7, 1, 3};
        int val = 2;
        searchBST (new TreeNode(4), 3);
    }

    public static TreeNode searchBST(TreeNode root, int val) {
        if (root == null) return null;
        else if (root.val == val) return root;
        else if (val < root.val) return searchBST(root.left, val);
        else return searchBST(root.right, val);
    }

}
