package BinaryTrees.PreorderInorderAndPostOrderTraversal;

public class solution {
    
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static Node root;

    public static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+ " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void postOrder(Node root){
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }

    public static void main(String[] args){

        root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(3);
        root.left.left.left = new Node(4);
        root.left.left.left.left = new Node(5);
        root.right = new Node(6);
        root.right.right = new Node(7);
        root.right.right.right = new Node(8);
        root.right.right.right.right = new Node(9);
        root.left.right = new Node(10);
        root.left.right.right = new Node(12);
        root.left.right.left = new Node(11);
        root.left.right.left.left = new Node(14);
        root.left.right.left.right = new Node(15);
        root.right.right.right.left = new Node(13);

        inOrder(root);
        System.out.println();
        preOrder(root);
        System.out.println();
        postOrder(root);

    }


}
