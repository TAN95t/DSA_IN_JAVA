package BinaryTrees.BoundaryTraversal;


import java.util.ArrayList;

public class solution {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static int idx = -1;

    public static Node buildTree(int nodes[]) {
        idx++;
        if (nodes[idx] == -1) {
            return null;
        }

        Node newNode = new Node(nodes[idx]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);

        return newNode;
    }

    // check if the node is leaf node of not
    public static boolean isLeaf(Node root){
        if(root.left == null && root.right == null){
            return true;
        }
        return false;
    }

    // get left boundary of the binary tree
    public static void leftBoundary(Node root, ArrayList<Integer> ans){
        Node curr = root.left;
        while(curr != null){
            if(!isLeaf(curr)){
                ans.add(curr.data);
            }
            if(curr.left != null){
                curr = curr.left;
            }
            else{
                curr = curr.right;
            }
        }
    }

    // get leaves
    public static void getLeaves(Node root, ArrayList<Integer> ans){
        if(isLeaf(root)){
            ans.add(root.data);
            return;
        }

        if(root.left != null) getLeaves(root.left, ans);
        if(root.right != null) getLeaves(root.right, ans);
    }

    // get right boundary 
    public static void rightBoundary(Node root , ArrayList<Integer> ans){
        if(root == null || isLeaf(root)){
            return;
        }
        if(root.right != null){
            rightBoundary(root.right,ans);
        }
        else if(root.left != null){
            rightBoundary(root.left, ans);
        }
        ans.add(root.data);
    }
    
    public static ArrayList<Integer> boundaryTraversal(Node root){ 
        ArrayList<Integer> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
        if(!isLeaf(root)){
            ans.add(root.data);
        }
        leftBoundary(root, ans);
        getLeaves(root, ans);
        rightBoundary(root.right, ans);
        return ans;
    }

    public static void main(String[] args){
        int nodes[] = {1,2,3,4,5,-1,-1,-1,-1,10,11,14,-1,-1,15,-1,-1,12,-1,-1,6,-1,7,-1,8,13,-1,-1,9,-1,-1};

        Node root = buildTree(nodes);

        System.out.print(root.data);

        System.out.println(boundaryTraversal(root).toString());
    }

}
