package irsad;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;
import java.util.stream.Stream;

public class Directed {
    public static void main(String[] args) {
        int edges[][] = { { 0, 2 }, { 0, 1 }, { 1, 3 },{ 2, 3 }, { 2, 4 }, { 4, 5 },  { 4, 6 }, { 5, 6 } };
        int n = 7;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        int indegree[]= new int[n];
        for(int edge[]:edges){
            int u = edge[0];
            int v = edge[1];
            adj.get(u).add(v);
            indegree[v]++;
        }

        // Arrays.stream(indegree).forEach(x->System.out.print(x+" "));
        int ans[]= new int[n];
        int idx=0;
        Queue<Integer>q = new ArrayDeque<>();
       
        for(int i=0;i<n;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        while (q.size()>0) {
            int node = q.remove();
            ans[idx]=node;idx++;
            for(int nbr:adj.get(node)){
                indegree[nbr]--;
                if(indegree[nbr]==0){
                    q.add(nbr);
                }
            }
            
        }
        Arrays.stream(ans).forEach(x->System.out.print(x+" "));
    }
}
