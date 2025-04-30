package irsad;

import java.util.ArrayList;

public class PrintAllPath {

    public static void main(String[] args) {
        int edges[][] = { { 0, 2 }, { 0, 1 }, { 2, 3 }, { 2, 4 }, { 4, 5 }, { 1, 3 }, { 4, 6 }, { 5, 6 } };
        int n = 7;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int edge[] : edges) {
            int u = edge[0];
            int v = edge[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        boolean vis[] = new boolean[n];

        printAllPath(adj, 0,6, vis, "");
    }

    private static void printAllPath(ArrayList<ArrayList<Integer>> adj, int src,int dest, boolean[] vis, String path) {
        // TODO Auto-generated method stub
        if(src == dest){
            System.out.println(path+" "+dest);return;
        }
        vis[src]=true;
        for(int nbr: adj.get(src)){
            if(!vis[nbr]){
                printAllPath(adj, nbr, dest, vis, path+" "+src);
            }
        }
        vis[src]=false;
    }
}