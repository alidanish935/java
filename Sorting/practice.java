package Sorting;

import java.util.Arrays;

public class practice {
    public static void main(String[] args) {
        int arr[]={12,1,4,2,7,9,5};//1,4, 2,5,7,9,12
        int n = arr.length;//               st     i
        sort(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }
    // -------------------  quick sort -------------------
    public static void sort(int arr[],int l,int h){
        if(l>=h)return;
        int piv = partiton(arr,l,h);
        sort(arr,l,piv-1);
        sort(arr,piv+1,h);
    }
    public static int partiton(int arr[],int l,int h){
        int piv = arr[h];int st =l;
        for(int i=l;i<h;i++){
            if(piv>arr[i]){
                int t = arr[i];
                arr[i]=arr[st];
                arr[st]=t;
                st++;
            }
        }
        int t =arr[st];
        arr[st]=arr[h];
        arr[h]=t;
        return st;
    }

    // -------------------  merge sort -------------------
    // public static void sort(int arr[],int l,int h){
    //     if(l>=h)return;
    //     int mid = (l+h)/2;
    //     sort(arr,l,mid);
    //     sort(arr,mid+1,h);
    //     merge(arr,l,mid,h);
    // }
    // public static void merge(int arr[],int l,int mid,int h){
    //     int n1 = mid-l+1; int n2 = h-mid;
    //     int left[]=new int[n1]; 
    //     int right[]=new int[n2];
    //     for(int i=0;i<n1;i++){
    //         left[i]=arr[l+i];
    //     }
    //     for(int i=0;i<n2;i++){
    //         right[i]=arr[mid+1+i];
    //     }
    //     int i=0,j=0,k=l;
    //     while(i<n1 && j<n2){
    //         if(left[i]<right[j]){
    //             arr[k]=left[i];i++;
    //         }else{
    //             arr[k]=right[j];j++;
    //         }
    //         k++;
    //     }
    //     while(i<n1){
    //         arr[k]=left[i];k++;i++;
    //     }
    //     while(j<n2){
    //         arr[k]=right[j];k++;j++;
    //     }
    // }
    // -------------------  quick sort -------------------
    // public static void sort(int arr[],int l,int h){
    //     if(l>=h) return;
    //     int piv = partition(arr,l,h);
    //     sort(arr,l,piv-1);
    //     sort(arr,piv+1,h);
    // }
    // static int partition(int arr[],int l,int h){
    //     int piv = arr[h],st=l;
    //     for(int i=l;i<h;i++){
    //         if(piv>arr[i]){
    //             int t = arr[st];
    //             arr[st]=arr[i];
    //             arr[i]=t;
    //             st++;
    //         }
    //     }
    //             int t = arr[st];
    //             arr[st]=arr[h];
    //             arr[h]=t;
    //     return st;
    // }
    
}
