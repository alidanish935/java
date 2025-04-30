package accio.assignment.TwoDarray;

import java.util.Arrays;

public class matrixMultiplication {
    public static void main(String[] args) {
        int m1[][]={{3,4},{2,1}};  int m2[][]={{1,2},{4,8}}; int n = m1.length; // output - {{19,38},{6,12}}
        int res[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int sum =0;int sum2 =0;
                for(int k=0;k<n;k++){
                    sum = sum+ m1[j][k]*m2[k][j];
                    sum2 = sum2+ m1[i][k]*m2[k][j];
                    System.out.print("sum- "+sum+" sum2 - "+sum2);
                    res[i][j]=sum;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
}
