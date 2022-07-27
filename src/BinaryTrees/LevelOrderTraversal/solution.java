package BinaryTrees.LevelOrderTraversal;

import java.util.Queue;
import java.util.LinkedList;

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

    static int idx = -1;

    public static Node buildTree(int[] nodes){
        idx++;
        if(nodes[idx]==-1){
            return null;
        }
        Node newNode = new Node(nodes[idx]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);
        
        return newNode;
    }

    public static void levelOrder(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node curr = q.remove();
            if(curr == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                System.out.print(curr.data+ " ");
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
        }
    }

    public static void main(String[] args){
        int nodes[] = {1,2,3,4,5,-1,-1,-1,-1,10,11,14,-1,-1,15,-1,-1,12,-1,-1,6,-1,7,-1,8,13,-1,-1,9,-1,-1};
        Node root = buildTree(nodes);
        System.out.println(root.data);
        levelOrder(root);
    }
}
