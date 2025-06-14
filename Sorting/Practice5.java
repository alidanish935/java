package Sorting;

import java.util.Arrays;
 //j=0 -> {9,1,4,2,5,3}
 //j=1 -> {1,9,4,2,5,3}
 //j=2 -> {1,4,9,2,5,3}
 //j=3 -> {1,4,2,9,5,3}
 //j=4 -> {1,4,2,5,9,3}
public class Practice5 {
    public static void main(String[] args) {
        //  1 , 2 , 8 , 9 , 4 , 3 , 7 
        // {3,1,4,2,5,9}
        // int arr[] = {  1 , 2 , 8 , 9 , 4 , 3 , 7 };
        // int n = arr.length;

        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n-i-1;j++){
        //         if(arr[j]>arr[j+1]){
        //             int t = arr[j];
        //             arr[j]=arr[j+1];
        //             t = arr[j];
        //         }
        //     }
        // }
        // System.out.println(Arrays.toString(arr));

// selection sort
        // int arr[]={7,8,3,1,2};
        // int n = arr.length;

        // for(int i=0;i<n;i++){
        //     int minIdx = i;
        //     for(int j=i+1;j<n;j++){
        //         if(arr[j]<arr[minIdx]){
        //             minIdx = j;
        //         }
        //     }
        //     int temp = arr[i];
        //     arr[i]=arr[minIdx];
        //     arr[minIdx]=temp;
        // }



// Insertion sort

        // for(int i=0;i<n;i++){
        //     int curr = arr[i];
        //     int j = i;
        //     while(j>0 && curr<arr[j-1]){
        //         arr[j]= arr[j-1];
        //         j--;
        //     }
        //     arr[j]=curr;
        // }
        // System.out.println(Arrays.toString(arr));

//  Quick sort

        int arr[]={12,3,5,9,11,4,6,5,8};
        int n =arr.length;
        sort(arr,0,n-1);
        System.out.println(Arrays.toString(arr));

    }

    private static void sort(int[] arr, int l, int h) {
        // TODO Auto-generated method stub
        if(l>=h)return;
        int pi = partition(arr,l,h);
        sort(arr, l, pi-1);
        sort(arr,  pi+1 ,h);

    }

    private static int partition(int[] arr, int l, int h) {
        // TODO Auto-generated method stub
        int piv = arr[h], st=l;
        for(int i=st;i<h;i++){
            if(piv>arr[i]){
                int temp = arr[i];
                arr[i]=arr[st];
                arr[st]=temp;
                st++;
            }
            int temp = arr[st];
            arr[st]=arr[h];
            arr[h]=temp;
            
        }
        return st;
    }
}
