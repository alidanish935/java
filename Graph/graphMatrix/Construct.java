package Graph.graphMatrix;

public class Construct {
    static int adjMatrix[][];
    Construct(int nodes){
        adjMatrix = new int[nodes][nodes];
    }

    public void addEdgesWithWt(int edges[][], boolean isDirected){
        for(int edge[]:edges){
            int u = edge[0];
            int v = edge[1];
            int wt = edge[2];

            if(isDirected){
                adjMatrix[u][v]=wt;
            }else{
                adjMatrix[u][v]=wt;
                adjMatrix[v][u]=wt;
            }
        }
    }
    public void addEdgesInMatrix(int edges[][], boolean isDirected){
        for(int edge[]: edges){
            int u = edge[0];
            int v = edge[1];

            //directed
            if(isDirected){
                adjMatrix[u][v]=1;
            }else{
                //undirected
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
        System.out.println();
    }
    public static void main(String[] args) {
        // int edges[][] = {{0,2},{0,1},{1,3}};
        // int nodes = 4;
        // Construct graph = new Construct(nodes);
        // System.out.println("unDirected graph");
        // graph.addEdgesInMatrix(edges, false);
        // print();

        // System.out.println("Directed graph");
        // Construct graph1 = new Construct(nodes);
        // graph1.addEdgesInMatrix(edges, true);
        // print();


        // with weight
        int edges[][] = {{0,2,10},{0,1,20},{1,3,30}};
        int nodes = 4;
        Construct graph = new Construct(nodes);
        System.out.println("unDirected graph");
        graph.addEdgesWithWt(edges, false);
        print();

        System.out.println("Directed graph");
        Construct graph1 = new Construct(nodes);
        graph1.addEdgesWithWt(edges, true);
        print();
    }
}
