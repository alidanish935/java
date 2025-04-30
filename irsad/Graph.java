package irsad;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class Graph {
    public static void main(String[] args) {
        int edges[][] = { { 0, 2 }, { 0, 1 }, { 2, 3 }, { 2, 4 }, { 2, 5 }, { 1, 3 } };
        int n = 6;
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
        // dfsTraversal(adj, 0, vis);
        // bfsTraversal(adj, 0, n);
        printAllPath(adj, 0, vis, "");

    }
    private static void printAllPath(ArrayList<ArrayList<Integer>> adj, int src, boolean[] vis, String string) {
        // TODO Auto-generated method stub
        
        throw new UnsupportedOperationException("Unimplemented method 'printAllPath'");
    }

    private static void bfsTraversal(ArrayList<ArrayList<Integer>> adj, int src, int n) {
        // TODO Auto-generated method stub
        Queue<Integer> q = new ArrayDeque<>();
        boolean vis[] = new boolean[n];

        q.add(src);
        while (q.size() > 0) {
            int size = q.size();
            while (size-- > 0) {
                int node = q.remove();
                System.out.print(node + " ");
                vis[node] = true;
                ArrayList<Integer> nbrs = adj.get(node);
                for (int nbr : nbrs) {
                    if (!vis[nbr]) {
                        q.add(nbr);
                    }
                }
            }
        }
        // throw new UnsupportedOperationException("Unimplemented method
        // 'bfsTraversal'");
    }

    private static void dfsTraversal(ArrayList<ArrayList<Integer>> adj, int src, boolean vis[]) {
        // TODO Auto-generated method stub
        vis[src] = true;
        System.out.println(src);
        for (int nbr : adj.get(src)) {
            if (!vis[nbr]) {
                dfsTraversal(adj, nbr, vis);
            }
        }
        // throw new UnsupportedOperationException("Unimplemented method
        // 'dfsTraversal'");
    }
}
