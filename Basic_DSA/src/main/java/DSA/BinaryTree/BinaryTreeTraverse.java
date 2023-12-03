package DSA.BinaryTree;

import lombok.*;

import java.util.Scanner;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
class Node{
    int data;
    Node left;
    Node right;
}

public class BinaryTreeTraverse {
    private static Node create() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter root value :");
        int data = scanner.nextInt();
        if(data == -1) return null;
        Node root = new Node();
        root.setData(data);
        System.out.println("enter left node value of root :"+ root.getData());
        root.setLeft(create());
        System.out.println("enter right node value of root :"+ root.getData());
        root.setRight(create());
        return  root;
    }
    public static void main(String[] args){
        Node root = create();

    }
}
