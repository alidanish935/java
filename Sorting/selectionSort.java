package Sorting;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        // in selection sort first of we will find min elem and we we will swap to first position
        int arr[]={2,1,8,9,4,3,7};
        int n = arr.length;

        for(int st=0;st<n;st++){
            int min = Integer.MAX_VALUE;
            int midx = -1;
            for(int i=st;i<n;i++){
                if(arr[i]<min){
                    min=arr[i];
                    midx=i;
                }
            }
            // int t = arr[midx];
            // arr[midx]=arr[st];
            // arr[st]=t;
             int t = min;
            min=arr[st];
            arr[st]=t;
        }
        System.out.print(Arrays.toString(arr));
    }
}
