package accio.Greedy;

import java.util.Arrays;

public class fractnKnap2 {
    static class Item{
        int weight;int value;
        Item(int w,int v){
            weight = w;
            value = v;
        }
    }//                                                             60 100 120
    public static void main(String[] args) {//                      10 20 30
        Item a = new Item(120, 30);
        Item b = new Item(100, 20);
        Item c = new Item(60, 10);
        Item arr[]={a ,b, c}; int n = arr.length;

        double ratio[][]=new double[2][n];
        for(int i=0;i<n;i++){
            Item item = arr[i];
            ratio[0][i]=i;
            ratio[1][i]=item.value/(double)item.weight;
        }
        Arrays.sort(arr,(x,y)->x.weight-y.weight);
        for(int i=0;i<n;i++){
            Item item =arr[i];
            System.out.println(item.value+" -> "+item.weight);
        }
    }
}
