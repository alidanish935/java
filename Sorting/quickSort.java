package Sorting;

import java.util.Arrays;

public class quickSort {
    public static void main(String[] args) {
        int arr[]={12,3,5,9,11,4,6,5,8};
        int n = arr.length;
        sort(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int a[],int l,int h){
        if(l>=h)return;
        int pi = partition(a,l,h);
        sort(a,l,pi-1);
        sort(a,pi+1,h);
    }
    public static int partition(int a[],int l,int h){//12 3 5 9 11 4 6 5 8
                                                      //                 i
        int piv  = a[h],st=l;// 5          // 3 5 4 6 5 12 9 11 8                     
        for(int i=st;i<h;i++){
            if(piv>a[i]){// 8
                int t = a[i];//5
                a[i]=a[st];//12
                a[st]=t;
                st++;
            }
        }
        int t=a[h];
        a[h]=a[st];
        a[st]=t;

        return st;
    }
}
