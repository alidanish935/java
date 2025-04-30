package Graph;

public class Practice {
    static int adjMatrix[][];
    Practice(int nodes){
        adjMatrix= new int[nodes][nodes];
    }
    public static void addEdgesInMatrix(int [][] edges,boolean isDirected){
        
        for(int edge[]: edges){
            int u = edge[0];
            int v = edge[1];

            // directed
            if(isDirected)
            adjMatrix[u][v]=1;
            else{
                // undirected
                adjMatrix[u][v]=1;
                adjMatrix[v][u]=1;
            }
        }
        
    }
    public static void print(){
        for(int i=0;i<adjMatrix.length;i++){
            System.out.print("row "+i+"-> ");
            for(int j=0;j<adjMatrix[0].length;j++){
                System.out.print(adjMatrix[i][j]+",");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int edges[][] = {{0,2},{0,1},{1,3}};
        int nodes = 4;
        Practice graph = new Practice(nodes);
        graph.addEdgesInMatrix(edges,true);
        print();
    }
}
