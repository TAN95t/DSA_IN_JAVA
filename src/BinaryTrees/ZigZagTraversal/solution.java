package BinaryTrees.ZigZagTraversal;

import java.util.*;

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

    public static Node buildTree(int []nodes){
        idx++;
        if(nodes[idx]==-1){
            return null;
        }

        Node newNode = new Node(nodes[idx]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);

        return newNode;
    }

    public static ArrayList<ArrayList<Integer>> zigZag(Node root){
        Queue<Node> q = new LinkedList<>();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        if(root == null){
            return ans;
        }

        q.offer(root);
        boolean flag = true;
        while(!q.isEmpty()){
            int n = q.size();
            ArrayList<Integer> list = new ArrayList<>();
            for(int i=0; i<n; i++){
                Node curr = q.poll();
                if(curr.left != null){
                    q.offer(curr.left);
                }
                if(curr.right != null){
                    q.offer(curr.right);
                }
                if(flag == true) {
                    list.add(curr.data);
                }
                else{
                    list.add(0,curr.data);
                }
                
            }
            flag = !flag;
            ans.add(list);
        }
        return ans;
    }


    public static void main(String[] args){
        int nodes[] = {1,2,3,4,5,-1,-1,-1,-1,10,11,14,-1,-1,15,-1,-1,12,-1,-1,6,-1,7,-1,8,13,-1,-1,9,-1,-1};
        Node root = buildTree(nodes);
        System.out.println(root.data);
        System.out.println(zigZag(root).toString());
    }
}
