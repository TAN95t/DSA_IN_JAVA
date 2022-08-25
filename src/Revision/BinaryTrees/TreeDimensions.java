package Revision.BinaryTrees;

class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class TreeDimensions {

    static int idx = -1;

    public static Node buildTree(int nodes[]){
        idx++;
        if(nodes[idx]==-1){
            return null;
        }
        

        Node newNode = new Node(nodes[idx]);

        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);

        return newNode;
        
    }

    public static int height(Node root){
        if(root == null){
            return 0;
        }

        return Math.max(height(root.left), height(root.right)) + 1;
    }   

    public static int countNodes(Node root){
        if(root == null){
            return 0;
        }

        return countNodes(root.left) + countNodes(root.right) + 1;
    }

    public static void main(String[] args){
        int nodes[] = {1,2,3,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root = buildTree(nodes);
        System.out.println(root.data);

        System.out.println(height(root));
        System.out.println(countNodes(root));
    }   
    
}
