package accio.assignment.graph;

import java.util.ArrayList;
import java.util.Arrays;

public class courseSchedule {
    public static void main(String[] args) {
        int arr[][]={{0,1},{0,2},{2,4},{2,3}};
        int freq[]=new int[arr.length+1];
       ArrayList<ArrayList<Integer>>graph = new ArrayList<>();
       for(int i=0;i<arr.length;i++){//0<1
     //for(int i=0;i<arr.length;i++){
        graph.add(new ArrayList<>());
       }
       for(int i=0;i<arr.length;i++){
        int pre[]= arr[i];//1,0
        int u = pre[0];freq[u]++;//1 , 1
        int v = pre[1];freq[v]++;//0, 1
        graph.get(v).add(u);//[[1],[]]
       }
       System.out.println(Arrays.toString(freq));
    }
}
