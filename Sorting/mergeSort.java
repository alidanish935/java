package Sorting;

import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int arr[]={12,3,5,9,11,4,6,5,8};
        int n = arr.length;
        sort(arr,0,n-1);//0 8
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int a[],int l,int h){
        if(l>=h) return;
        int mid = (l+h)/2;//4
        sort(a,l,mid);//0 4  , 0 2 ,0 1 ,0 0 , 3 3
        sort(a,mid+1,h);// 0 1, 1 2, 2 4,3 4 , 
        merge(a,l,mid,h);// 0 0 1, 0 1 2 ,3 3 4 ,
        
    }
    public static void merge(int a[],int l,int mid,int h){
        int n1 = mid-l+1;int n2 = h-mid;
        int left[]=new int[n1];
        int right[]=new int[n2];
        for(int i=0;i<n1;i++){
            left[i]=a[i+l];
        }
        for(int i=0;i<n2;i++){
            right[i]=a[mid+i+1];
        }
        int i=0,j=0,k=l;
        while(i<n1 && j<n2){
            if(left[i]<=right[j]){
                a[k]=left[i];i++;
            }else{
                a[k]=right[j];j++;
            }
            k++;
        }
        while(i<n1){
            a[k]=left[i];i++;k++;
        }
        while(j<n2){
            a[k]=right[j];j++;k++;
        }
    }
}
