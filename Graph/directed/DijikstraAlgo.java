package Graph.directed;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class DijikstraAlgo {
    static class Pair{
        int nbr,wt;
        Pair(int n,int w){
            nbr = n;wt = w;
        }
    }
    public static void main(String[] args) {
         int edges[][] = { { 0, 3,30 }, { 0, 1,1 }, { 2, 3,3 }, { 3, 4,4 }, { 4, 5,1 }, { 1, 2,4 },{5,6,2},{6,4,7} };
        int nodes = 7;

        ArrayList<ArrayList<Pair>>graph = new ArrayList<>();
        for(int i=0;i<nodes;i++){
            graph.add(new ArrayList<>());
        }

        for(int edge[]:edges){
            int u = edge[0];int v = edge[1];int w = edge[2];
            graph.get(u).add(new Pair(v, w));
            graph.get(v).add(new Pair(u, w));
        }

        ArrayList<Integer>ans = new ArrayList<>();
        boolean vis[]=new boolean[nodes];
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->a.wt - b.wt);
        pq.add(new Pair(0, 0));

        while(pq.size()>0){
            Pair rPair = pq.remove();
            int src = rPair.nbr;int wt = rPair.wt;
            if(vis[src])continue;
            vis[src]=true;
            ans.add(src);
            for(Pair pair:graph.get(src)){
                int nbr = pair.nbr; int nbr_wt = pair.wt;
                
            }
        }
    }
}
