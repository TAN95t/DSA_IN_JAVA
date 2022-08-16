package Graphs.GraphProblemsWithDFS;


import java.util.*;

public class solution {
    
    static class edge{
        int v1;
        int v2;
        int wt;
        edge(int v1, int v2, int wt){
            this.v1 = v1;
            this.v2 = v2;
            this.wt = wt;
        }
    }


    static String spath;
    static Integer spathwt = Integer.MAX_VALUE;
    static String lpath;
    static Integer lpathwt = Integer.MIN_VALUE;
    static String cpath;
    static Integer cpathwt = Integer.MAX_VALUE;
    static String fpath;
    static Integer fpathwt = Integer.MIN_VALUE;

    static PriorityQueue<Pair> pq = new PriorityQueue<>();


    public static void findPath(ArrayList<ArrayList<edge>> adj, int src, int des, int k, String psf, int wsf, int criteria, boolean vis[]){
        if(src == des){
            if(wsf < spathwt){
                spathwt = wsf;
                spath = psf;
            }
            if(wsf > lpathwt){
                lpathwt = wsf;
                lpath = psf;
            }
            if(wsf > criteria && wsf < cpathwt){
                cpathwt = wsf;
                cpath = psf;
            }
            if(wsf < criteria && wsf > fpathwt){
                fpathwt = wsf;
                fpath = psf;
            }

            if(pq.size() < k){
                pq.add(new Pair(wsf, psf));
            }
            else if(pq.size() > k){
                if(wsf > pq.peek().wsf){
                    pq.remove();
                    pq.add(new Pair(wsf, psf));
                }
            }
            return;
        }

        vis[src] = true;

        for(edge it : adj.get(src)){
            if(vis[it.v2] == false){
                findPath(adj, it.v2, des, k, psf+it.v2, wsf+it.wt, criteria, vis);
            }
        }

        vis[src] = false;
    }



    public static void main(String[] args){
        int vtces[] = {0,1,2,3,4,5,6};
        int n = vtces.length;

        boolean vis[] = new boolean[n];

        Arrays.fill(vis, false);
        
        ArrayList<ArrayList<edge>> adj = new ArrayList<>();
        
        for(int i=0; i<n; i++){
            adj.add(new ArrayList<>());
        }

        adj.get(0).add(new edge(0, 1, 10));
        adj.get(0).add(new edge(0, 3, 40));

        adj.get(1).add(new edge(1, 2, 10));
        adj.get(1).add(new edge(1, 0, 10));

        adj.get(2).add(new edge(2, 3, 10));
        adj.get(2).add(new edge(2, 1, 10));

        adj.get(3).add(new edge(3, 0, 40));
        adj.get(3).add(new edge(3, 2, 10));
        adj.get(3).add(new edge(3, 4, 2));

        adj.get(4).add(new edge(4, 3, 2));
        adj.get(4).add(new edge(4, 5, 3));
        adj.get(4).add(new edge(4, 6, 8));

        adj.get(5).add(new edge(5, 4, 3));
        adj.get(5).add(new edge(5, 6, 3));

        adj.get(6).add(new edge(6, 5, 3));
        adj.get(6).add(new edge(6, 4, 8));


        findPath(adj, 0, 6, 1, "0", 0, 40, vis);

        System.out.println(spath);
        System.out.println(spathwt);
        System.out.println(lpath);
        System.out.println(lpathwt);
        System.out.println(cpath);
        System.out.println(cpathwt);
        System.out.println(fpath);
        System.out.println(fpathwt);
        System.out.println(pq.peek().wsf);
        System.out.println(pq.peek().psf);
    }


}
