package Graph.graphAdjList;

import java.util.ArrayList;

/**
 * Graph1
 */
public class Graph1 {

    static class Edge{
        int src, nbr;
        Edge(int s,int n){
            src = s; nbr = n;
        }
    }
    static ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
    static ArrayList<ArrayList<Edge>> adjList2 = new ArrayList<>();
    Graph1(int nodes){
        for(int i=0;i<nodes;i++){
            adjList.add(new ArrayList<>());
            // when adding in pair
            adjList2.add(new ArrayList<Edge>());
        }
    }
    public static void addEdgesInList(int edges[][] ,boolean isDirected){
        for(int edge[]:edges){
            int u = edge[0];
            int v = edge[1];

            if(isDirected){
                adjList2.get(u).add(new Edge(u,v));
            }else{
                adjList2.get(u).add(new Edge(u, v));
                adjList2.get(v).add(new Edge(v, u));
            }
        }
    }
    public static void addEdgesInAdjList(int edges[][] ,boolean isDirected){
        for(int edge[]: edges){
            int u = edge[0];
            int v = edge[1];

            if(isDirected)
                adjList.get(u).add(v);
            else{
                adjList.get(u).add(v);
                adjList.get(v).add(v);
            }

        }
    }

    // public static void printList2(){
    //     for(int i=0;i<adjList2.size();i++){
    //         System.out.print(i+"-> ");
    //         for(int j=0;j<adjList2.get(i).size();j++){
    //             System.out.print(adjList2.get{i}.get(j));
    //         }
    //     }
    // }
    public static void printList(){
        for(int i=0;i<adjList.size();i++){
            System.out.print(i+"-> " +"[");
            for(int j=0;j<adjList.get(i).size();j++){
                System.out.print(adjList.get(i).get(j));
                if(j<adjList.get(i).size()-1)
                System.out.print(",");
            }
            System.out.print("]");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // int edges[][] = {{0,2},{0,1},{1,3}};
        int edges[][] = {{0,2},{0,1},{2,3},{2,4},{2,5}};
        int nodes = 6;
        Graph1 graph1 = new Graph1(nodes);
        graph1.addEdgesInAdjList(edges, false);
        // System.out.println(adjList);
        printList();


        // Graph1 graph2 = new Graph1(nodes);
        // graph2.addEdgesInList(edges, true);
        // System.out.println(adjList2);
    }
    
}