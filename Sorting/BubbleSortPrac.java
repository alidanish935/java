package Sorting;

import java.util.Arrays;

public class BubbleSortPrac {
    public static void main(String[] args) {
        int arr[]={2,1,8,9,4,3,7};//  1 , 2 , 8 , 9 , 4 , 3 , 7 
        int n = arr.length;

        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int t = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
