package Graph.directed;

import java.util.ArrayList;

public class CompleteGraph {
    public static void main(String[] args) {
        int edges[][] = { { 0, 3 }, { 0, 1 }, { 2, 3 }, { 3, 4 }, { 4, 5 }, { 1, 2 },{5,6},{6,4} };
        int nodes = 7;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < nodes; i++) {
            graph.add(new ArrayList<>());
        }

        for (int edge[] : edges) {
            int u = edge[0];
            int v = edge[1];
            graph.get(u).add(v);
        }

        // if(detectCycle(graph)){
        //     System.out.println(true);
        // }else{
        //     System.out.println(false);
        // }
        
        if(detectCycle(graph)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

        
    }

    private static boolean detectCycle(ArrayList<ArrayList<Integer>> graph) {
        // TODO Auto-generated method stub
        boolean vis[] = new boolean[7];
        boolean inRecursion[] = new boolean[7];
        for (int i = 0; i < 7; i++) {
            if (!vis[i] && detect(graph, i, vis, inRecursion))
                return true;
        }
        return false;
    }

    private static boolean detect(ArrayList<ArrayList<Integer>> graph, int src, boolean[] vis, boolean[] inRecursion) {
        // TODO Auto-generated method stub
        vis[src]=true;
        inRecursion[src]=true;
        for(int nbr:graph.get(src)){
            if(!vis[nbr]&&detect(graph, nbr, vis, inRecursion))
            return true;
            else if(inRecursion[nbr]) return true;
        }
        inRecursion[src]=false;
        return false;
    }
}
