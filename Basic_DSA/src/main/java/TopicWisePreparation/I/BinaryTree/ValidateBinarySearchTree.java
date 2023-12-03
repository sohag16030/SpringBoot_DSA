package TopicWisePreparation.I.BinaryTree;


import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ValidateBinarySearchTree {
    private static TreeNode create() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter root value:");
        int data = sc.nextInt();
        if (data == -1) return null;
        TreeNode root = new TreeNode(); // root construction
        root.val = data;
        System.out.println("Enter left node value of root :" + root.val);
        root.left = create();
        System.out.println("Enter right node value of root :" + root.val);
        root.right = create();
        return root;
    }

    public static void main(String[] args) {
        TreeNode root = create();
        System.out.println(isValidBST(root));
    }

    public static boolean isValidBST(TreeNode root) {
        List<Integer> list = helperMethod(root, new ArrayList<>());
        if (checkListIsSorted(list)) {
            return true;
        } else return false;
    }

    private static boolean checkListIsSorted(List<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i + 1) <= list.get(i)) return false;
        }
        return true;
    }

    private static List<Integer> helperMethod(TreeNode root, List<Integer> list) {
        if (root == null)
            return list;
        helperMethod(root.left, list);
        list.add(root.val);
        helperMethod(root.right, list);
        return list;
    }
}
