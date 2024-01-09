package Sorting;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        // in selection sort first of we will find min elem and we we will swap to first position,
        //Approach -> firstly we will find min elem 
        int arr[]={2,1,8,9,4,3,7};//  1 , 2 , 8 , 9 , 4 , 3 , 7 
        int n = arr.length;        //        st
                                //           i
       
        for(int st =0;st<n;st++){
            int min = Integer.MAX_VALUE;
            int midx =st;

            for(int i=st;i<n;i++){
                if(arr[i]<min){
                    min =arr[i];
                    midx = i;
                }
            }
            int t = arr[st];
            arr[st]=arr[midx];
            arr[midx]=t;
        }

        // Descending Order
        
    for(int st = 0;st<n;st++){
        int mx = Integer.MIN_VALUE;
        int mxIdx= st;
        for(int i=st;i<n;i++){
            if(arr[i]>mx){
                mx=arr[i];
                mxIdx=i;
            }
        }
        int t = arr[st];
        arr[st]=arr[mxIdx];
        arr[mxIdx]=t;
    }
        // for(int st=0;st<n;st++){
        //     int min = Integer.MAX_VALUE;
        //     int midx = -1;
        //     for(int i=st;i<n;i++){
        //         if(arr[i]<min){
        //             min=arr[i];
        //             midx=i;
        //         }
        //     }
        //     // int t = arr[midx];
        //     // arr[midx]=arr[st];
        //     // arr[st]=t;
        //      int t = min;
        //     min=arr[st];
        //     arr[st]=t;
        // }
        System.out.print(Arrays.toString(arr));
    }
}
