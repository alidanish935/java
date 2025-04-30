package irsad.weightedGraph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Creation {
    static class Pair {
        int node;
        int wt;

        Pair(int n, int w) {
            node = n;
            wt = w;
        }
    }

    public static void main(String[] args) {
        int edges[][] = { { 0, 2, 10 }, { 0, 1, 1 }, { 1, 3, 2 }, { 2, 3, 1 }, { 2, 4, 5 }, { 4, 5, 2 }, { 4, 6, 8 },
                { 5, 6, 3 } };
        int n = 7;

        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int edge[] : edges) {
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];

            adj.get(u).add(new Pair(v, w));
            adj.get(v).add(new Pair(u, w));
        }
        dijkstra(adj, 0, 6,n);
    }

    private static void dijkstra(ArrayList<ArrayList<Pair>> adj, int src, int dest,int n) {
        // TODO Auto-generated method stub
        PriorityQueue<Pair>pq = new PriorityQueue<>((a,b) -> a.wt - b.wt);
        int ans[]=new int[n];
        boolean vis[]=new boolean[n];
        
        pq.add(new Pair(src, 0));
        while (pq.size()>0) {
            Pair rPair = pq.remove();
            int node = rPair.node;
            int wt = rPair.wt;
            if(vis[node])continue;
            vis[node] = true;
            ans[node ]= wt;

            for(Pair pair:adj.get(node)){
                int nbr = pair.node;
                int nbr_wt = pair.wt;
                if(!vis[nbr]){
                    pq.add(new Pair(nbr, wt+nbr_wt));
                }
            }
        }
        Arrays.stream(ans).forEach(x -> System.out.print(x+" "));
    }
}
