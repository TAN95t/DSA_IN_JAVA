package BinarySearchTrees.SortedArrayToBST;

class Node{
    int data;
    Node left, right;

    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class solution {
    
    static Node root;

    public static Node arrayToBST(int arr[], int start, int end){
        if(start > end){
            return null;
        }
        int mid = (start + end)/2;
        Node newNode = new Node(arr[mid]);

        newNode.left = arrayToBST(arr, start, mid-1);

        newNode.right = arrayToBST(arr, mid+1, end);

        return newNode;
    }

    public static void preOrder(Node head){
        if(head == null){
            return;
        }
        System.out.print(head.data+ " ");
        preOrder(head.left);
        preOrder(head.right);
    }

    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6,7};
        int n = arr.length;
        root = arrayToBST(arr, 0, n-1);

        preOrder(root);
    }   
}
