package Sorting;

import java.util.Arrays;

public class practice {
    public static void main(String[] args) {
        int arr[]={12,1,4,2,7,9,5};//1,4, 2,5,7,9,12
        int n = arr.length;//               st     i
        sort(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }

    // quick sort
    public static void sort(int arr[],int l,int h){
        if(l>=h) return;
        int piv = partition(arr,l,h);
        sort(arr,l,piv-1);
        sort(arr,piv+1,h);
    }
    static int partition(int arr[],int l,int h){
        int piv = arr[h],st=l;
        for(int i=l;i<h;i++){
            if(piv>arr[i]){
                int t = arr[st];
                arr[st]=arr[i];
                arr[i]=t;
                st++;
            }
        }
                int t = arr[st];
                arr[st]=arr[h];
                arr[h]=t;
        return st;
    }
    
}
