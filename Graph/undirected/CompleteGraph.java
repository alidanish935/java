package Graph.undirected;

import java.util.ArrayList;
// practiced on 20/01/25

public class CompleteGraph {
    public static void main(String[] args) {
        int edges[][] = { { 0, 2 }, { 0, 1 }, { 2, 3 }, { 2, 4 }, { 2, 5 }, {1,3} };
        int nodes = 6;

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            graph.add(new ArrayList<>());
        }

        for (int edge[] : edges) {
            int u = edge[0];
            int v = edge[1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        boolean vis[] = new boolean[nodes];
        // printUsingDFS(graph, 0, vis);
        for(int i=0;i<6;i++){
            if(!vis[i] && detectCycle(graph, i, -1, vis))
            System.out.println(true);break;     
        }
        System.out.println(false);     
        
    }

    private static boolean detectCycle(ArrayList<ArrayList<Integer>> graph, int src, int par, boolean[] vis) {
        // TODO Auto-generated method stub
        if(vis[src])return true;
        vis[src]=true;
        for(int nbr:graph.get(src)){
            if(nbr != par && detectCycle(graph,nbr, src, vis));
            return true;
        }
        return false;
    }

    private static void printUsingDFS(ArrayList<ArrayList<Integer>> graph, int src, boolean[] vis) {
        // TODO Auto-generated method stub
        vis[src] = true;
        System.out.print(src + " ");
        for (int nbr : graph.get(src)) {
            if (!vis[nbr]) {
                printUsingDFS(graph, nbr, vis);
            }
        }
    }
}
