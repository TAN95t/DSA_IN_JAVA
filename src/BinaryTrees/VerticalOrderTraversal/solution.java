package BinaryTrees.VerticalOrderTraversal;

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

    static class tuple{
        Node node;
        int row;
        int col;
        tuple(Node node, int row, int col){
            this.node = node;
            this.row = row;
            this.col = col;
        }
    }

    public static ArrayList<ArrayList<Integer>> verticalTraversa(Node root){
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
        Queue<tuple> q = new LinkedList<>();
        q.offer(new tuple(root, 0, 0));
        while(!q.isEmpty()){
            tuple curr = q.poll();
            Node node = curr.node;
            int x = curr.row;
            int y = curr.col;

            if(!map.containsKey(x)){
                map.put(x, new TreeMap<>());
            }

            if(!map.get(x).containsKey(y)){
                map.get(x).put(y, new PriorityQueue<>());
            }

            map.get(x).get(y).offer(node.data);

            if(node.left != null){
                q.offer(new tuple(node.left, x-1, y+1));
            }

            if(node.right != null){
                q.offer(new tuple(node.right, x+1, y+1));
            }
        }


        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for(TreeMap<Integer, PriorityQueue<Integer>> ys: map.values()){
            ans.add(new ArrayList<Integer>());
            for(PriorityQueue<Integer> nodes : ys.values()){
                while(!nodes.isEmpty()){
                    ans.get(ans.size()-1).add(nodes.poll());
                }
            }
        }
        return ans;
    }

    public static void main(String args[]){
        int nodes[] = {1,2,3,4,5,-1,-1,-1,-1,10,11,14,-1,-1,15,-1,-1,12,-1,-1,6,-1,7,-1,8,13,-1,-1,9,-1,-1};
        Node root = buildTree(nodes);
        System.out.println(root.data);

    }
}
