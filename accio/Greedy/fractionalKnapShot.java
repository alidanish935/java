package accio.Greedy;

import java.util.*;

public class fractionalKnapShot {
    public static void main(String[] args) {
        int val []={60,100,120};
        int weight[]={10,20,30};
        int w=50;int n =val.length;

        double ratio[][]= new double[val.length][2];
        for(int i=0;i<val.length;i++){
            ratio[i][0]=i;
            ratio[i][1]=(val[i]/(double)weight[i]);
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                System.out.print((int) ratio[i][j]+" ");
            }
            System.out.println();
        }
        Arrays.sort(ratio,Comparator.comparingDouble(o ->o[1]));
        double maxV=0;
        for(int i=ratio.length-1;i>=0;i--){
            int idx = (int)ratio[i][0];//0
            if(w>=weight[idx]){
                maxV += val[idx];
                w=w-weight[idx];
            }else{
                maxV += ratio[i][1]*w;
                w=0;
            }
        }
        System.out.println(maxV);
    }
}
