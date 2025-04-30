package Graph.directed;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class CycleDetectByKahns {
    public static void main(String[] args) {
        int edges[][] = { { 0, 3 }, { 0, 1 }, { 2, 3 }, { 3, 4 }, { 4, 5 }, { 1, 2 },{5,6},{6,4} };
        int nodes = 7;
        ArrayList<ArrayList<Integer>>graph = new ArrayList<>();
        for(int i=0;i<nodes;i++){
            graph.add(new ArrayList<>());
        }

        int indegree[]=new int[nodes];
        for(int edge[]:edges){
            int u = edge[0]; int v = edge[1];
            graph.get(u).add(v);
            indegree[v]++;
        }

        Queue<Integer>q = new ArrayDeque<>();
        int ct =0;
        for(int i=0;i<nodes;i++){
            if(indegree[i]==0){
                q.add(i);ct++;
            }
        }

        while (q.size()>0) {
            int src = q.remove();
            for(int nbr:graph.get(src)){
                indegree[nbr]--;
                if(indegree[nbr]==0){
                    q.add(nbr);ct++;
                }
            }
        }
        if(ct<nodes){
            System.out.println("Cycle detected -- ");
        }else{
            System.out.println("no cycle");
        }
    }
}
