package BinaryTrees.TreeViewsLeftRigthTopBottom;

import java.util.Map;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
import java.util.TreeMap;

public class solution {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static class pair{
        int distance;
        Node node;
        pair(int distance, Node node){
            this.distance = distance;
            this.node = node;
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

    // function to get top view of the binary tree
    public static ArrayList<Integer> topView(Node root){
        ArrayList<Integer> view = new ArrayList<>();
        if(root == null){
            return view;
        }
        Queue<pair> q = new LinkedList<>();
        TreeMap<Integer, Integer> map = new TreeMap<>();

        q.add(new pair(0, root));

        while(!q.isEmpty()){
            pair curr = q.remove();
            if(!map.containsKey(curr.distance)){
                map.put(curr.distance, curr.node.data);
            }

            if(curr.node.left != null){
                q.add(new pair(curr.distance - 1, curr.node.left));
            }

            if(curr.node.right != null){
                q.add(new pair(curr.distance + 1, curr.node.right));
            }
        }

        for(Map.Entry<Integer, Integer> it : map.entrySet()){
            view.add(it.getValue());
        }

        return view;
    }

    // function to get the bottom view of the binary tree
    public static ArrayList<Integer> bottomView(Node root){
        ArrayList<Integer> view  = new ArrayList<>();
        Queue<pair> q = new LinkedList<>();
        if(root == null){
            return view;
        }
        TreeMap<Integer, Integer> map = new TreeMap<>();

        q.add(new pair(0, root));
        while(!q.isEmpty()){
            pair curr = q.remove();
            
            map.put(curr.distance, curr.node.data);

            if(curr.node.left != null){
                q.add(new pair(curr.distance -1, curr.node.left));
            }

            if(curr.node.right != null){
                q.add(new pair(curr.distance+1, curr.node.right));
            }
        }

        for(Map.Entry<Integer, Integer> it : map.entrySet()){
            view.add(it.getValue());
        }

        return view;
    }

    // function to get the left view of the binary tree
    public static ArrayList<Integer> leftView(Node root){
        ArrayList<Integer> view = new ArrayList<>();
        Queue<pair> q = new LinkedList<>();
        if(root == null){
            return view;
        }
        TreeMap<Integer, Integer> map = new TreeMap<>();

        q.add(new pair(0,root));
        while(!q.isEmpty()){
            pair curr = q.remove();
            if(!map.containsKey(curr.distance)){
                map.put(curr.distance, curr.node.data);
            }

            if(curr.node.left != null){
                q.add(new pair(curr.distance+1, curr.node.left));
            }

            if(curr.node.right != null){
                q.add(new pair(curr.distance+1, curr.node.right));
            }
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            view.add(entry.getValue());
        }

        return view;
    }

    // function to get the right view of the binary tree
    public static ArrayList<Integer> rightView(Node root){
        ArrayList<Integer> view = new ArrayList<>();
        if(root == null){
            return view;
        }
        Queue<pair> q = new LinkedList<>();
        TreeMap<Integer, Integer> map = new TreeMap<>();

        q.add(new pair(0, root));

        while(!q.isEmpty()){
            pair curr = q.remove();
            map.put(curr.distance, curr.node.data);

            if(curr.node.left != null){
                q.add(new pair(curr.distance+1, curr.node.left));
            }

            if(curr.node.right != null){
                q.add(new pair(curr.distance+1, curr.node.right));
            }
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            view.add(entry.getValue());
        }

        return view;
    }

    public static void main(String[] args){
        int nodes[] = {1,2,3,4,5,-1,-1,-1,-1,10,11,14,-1,-1,15,-1,-1,12,-1,-1,6,-1,7,-1,8,13,-1,-1,9,-1,-1};
        Node root = buildTree(nodes);

        System.out.println("Top view:"+ topView(root).toString());
        System.out.println("Bottom view:"+ bottomView(root).toString());
        System.out.println("Left view:"+ leftView(root).toString());
        System.out.println("Right view:"+ rightView(root).toString());
    }
}
