package Revision.BinaryTrees;

import java.util.*;

public class TreeViews {
    static class Node{
        int data;
        int hd;
        Node left;
        Node right;

        Node(int d){
            data = d;
            left = null;
            right = null;
        }
    }

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

    public static ArrayList<Integer> topView(Node root){
        ArrayList<Integer> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }

        Map<Integer, Integer> map = new TreeMap<>();
        Queue<Node> q = new ArrayDeque<>();
        root.hd = 0;
        q.add(root);
        while(!q.isEmpty()){
            Node temp = q.remove();
            int hd = temp.hd;
            if(!map.containsKey(hd)){
                map.put(hd, temp.data);
            }

            if(temp.left != null){
                temp.left.hd = hd-1;
                q.add(temp.left);
            }

            if(temp.right != null){
                temp.right.hd = hd+1;
                q.add(temp.right);
            }
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            ans.add(entry.getValue());
        }

        return ans;
    }


    public static ArrayList<Integer> bottomView(Node root){
        ArrayList<Integer> ans = new ArrayList<>();
        
        TreeMap<Integer, Integer> map = new TreeMap<>();
        Queue<Node> q = new ArrayDeque<>();
        root.hd = 0;
        q.add(root);
       

        while(!q.isEmpty()){
            Node temp = q.remove();
            int hd = temp.hd;
            map.put(hd, temp.data);
            
            if(temp.left != null){
                temp.left.hd = hd-1;
                q.add(temp.left);
            }

            if(temp.right != null){
                temp.right.hd = hd+1;
                q.add(temp.right);
            }
        }


        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            ans.add(entry.getValue());
        }
        return ans;
    }



    public static ArrayList<Integer> leftView(Node root){
        ArrayList<Integer> ans = new ArrayList<>();

        Queue<Node> q = new ArrayDeque<>();
        q.add(root);

        while(!q.isEmpty()){
            int n = q.size();
            
            for(int i=1; i<=n; i++){
                Node temp = q.remove();

                if(i == 1){
                    ans.add(temp.data);
                }

                if(temp.left != null){
                    q.add(temp.left);
                }

                if(temp.right != null){
                    q.add(temp.right);
                }
            }
        }

        return ans;
    }


    public static ArrayList<Integer> rightView(Node root){
        ArrayList<Integer> ans = new ArrayList<>();

        Queue<Node> q = new ArrayDeque<>();

        q.add(root);

        while(!q.isEmpty()){

            int n = q.size();

            for(int i=1; i<=n; i++){

                Node temp = q.poll();

                if(i == n){
                    ans.add(temp.data);
                }

                if(temp.left != null){
                    q.add(temp.left);
                }

                if(temp.right != null){
                    q.add(temp.right);
                }
            }
        }

        return ans;
    }





    public static void main(String[] args){
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root = TreeViews.buildTree(nodes);
        System.out.println(root.data);

        System.out.println(topView(root).toString());
        System.out.println(bottomView(root).toString());
        System.out.println(leftView(root).toString());
        System.out.println(rightView(root).toString());
    }
    
}
