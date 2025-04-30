package Sorting;

import java.util.Arrays;

public class quickSort {
    public static void main(String[] args) {
        int arr[]={12,3,5,9,11,4,6,5,8};
        int n = arr.length;
        sort(arr,0,n-1);
        // System.out.println(Arrays.toString(arr));
    }
    public static void sort(int a[],int l,int h){
        if(l>=h)return;
        int pi = partition(a,l,h);
        sort(a,l,pi-1);
        sort(a,pi+1,h);
    }//{12,3,5,9,11,4,6,5,8}; -> {3,12,5,9,11,4,6,5,8};->{3,5,12,9,11,4,6,5,8} ->{3,5,4,9,11,12,6,5,8}->{3,5,4,6,5,12,9,11,8}->{3,5,4,6,5,8,9,11,12}
    //{12,3,5,9,11,4,6,5,8};
    //                                                          st
    public static int partition(int a[],int l,int h){//3 5 4 6 5 12 9 11 8   //2nd eg- {1,12,4,2,7,9,5};
        //                   i
        int piv  = a[h],st=l;// 5          // 12 3 5 9 11 4 6 5 8                     
        for(int i=st;i<h;i++){
            if(piv>a[i]){// 5>1
                int t = a[i];//1
                a[i]=a[st];//12
                a[st]=t;//3
                st++;//1
            }
        }
        int t=a[h];
        a[h]=a[st];
        a[st]=t;
        System.out.println(Arrays.toString(a));

        return st;
    }
}
