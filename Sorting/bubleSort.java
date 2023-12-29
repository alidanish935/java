package Sorting;

import java.util.Arrays;

public class bubleSort {
    public static void main(String[] args) {
        int arr[]={3,1,4,2,5,9};
        int n = arr.length;
        boolean swap = false;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int t = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                    swap = true;
                }
            }
            if(!swap){
                break;
            }
        }
        System.out.print(Arrays.toString(arr));
    }
}
