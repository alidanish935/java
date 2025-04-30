package Graph.directed;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class KahnsAlgo {
    public static void main(String[] args) {
        int edges[][] = { { 0, 3 }, { 0, 1 }, { 2, 3 }, { 3, 4 }, { 4, 5 }, { 1, 2 },{5,6} };
        int nodes = 7;

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < nodes; i++) {
            graph.add(new ArrayList<>());
        }
        int indegree[]=new int[nodes];
        for(int edge[]:edges){
            int u = edge[0];  int v = edge[1];
            graph.get(u).add(v);
            indegree[v]++;
        }

        Queue<Integer>q = new ArrayDeque<>();
        for(int i=0;i<nodes;i++){
            if(indegree[i]==0)q.add(i);
            // System.out.print(i+" ");
        }

        while (q.size()>0) {
            int src = q.remove();
            System.out.print(src+" ");
            for(int nbr:graph.get(src)){
                indegree[nbr]--;
                if(indegree[nbr]==0){
                    q.add(nbr);
                }
            }
        }
    }
}
