package Sorting;

import java.util.Arrays;

public class countingSort {
    public static void main(String[] args) {
        int arr[] = {4,7,1,3,2,9,6,8,1,4,1,1,3,3};int n = arr.length;
        int ct[]=new int[15];// {0,4,1,3,2,0,1,1,1,1}
        for(int i=0;i<n;i++){
            int val =arr[i];//4
            ct[val]=ct[val]+1;
        }
       System.out.println(Arrays.toString(ct));
        for(int i=0;i<11;i++){
            if(ct[i]!=0){
                for(int j=0;j<ct[i];j++){
                    // System.out.print(i+" ");
                }
            }
          // System.out.print(ct[i]+" ");
        }
    }
}
