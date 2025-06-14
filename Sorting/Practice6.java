package Sorting;

import java.util.Arrays;

public class Practice6 {
    public static void main(String[] args) {
        int arr[] = {7,8,3,1,2};
        int n = arr.length;

        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n-i-1;j++){
        //         if(arr[j]>arr[j+1]){
        //             int t = arr[j];
        //             arr[j]=arr[j+1];
        //             arr[j+1]=t;
        //         }
        //     }
        // }

    //Slection sort
    // for(int i=0;i<n;i++){
    //     int minIdx = i;
    //     for(int j=i;j<n;j++){
    //         if(arr[j]<arr[minIdx]){
    //             minIdx =j;
    //         }
    //     }
    //     int t = arr[i];
    //     arr[i]=arr[minIdx];
    //     arr[minIdx]=t;
    // }


    // Insertion Sort
    // for(int i=0;i<n;i++){
    //     int elm = arr[i];
    //     int j=i;
    //     while (j>0 && elm<arr[j-1]) {
    //         arr[j]=arr[j-1];
    //         j--;
    //     }
    //     arr[j]=elm;
    // }
    
    
    //Quick sort

    // sort(arr,0,n-1);
    
    divide(arr,0,n-1);
    System.out.println(Arrays.toString(arr));
    }

    private static void divide(int[] arr, int l, int h) {
        // TODO Auto-generated method stub
        if(l>=h)return;
        int mid = (l+h)/2;
        divide(arr, l, mid);
        divide(arr, mid+1, h);
        conquere(arr,l,mid,h);
    }

    private static void conquere(int[] arr, int l, int mid, int h) {
        // TODO Auto-generated method stub   {12,3,5,9,11,4,6,5,8
       
        int n1 = mid-l+1, n2 = h - mid;
        int left[] = new int[n1]; 
        int right[] = new int[n2]; 

        int idx =0;
        for(int i=l;i<=mid;i++){
            left[idx]=arr[i];idx++;
        }
        idx =0;
        for(int i=mid+1;i<=h;i++){
            right[idx]=arr[i];idx++;
        }
        int i=0,j=0,k=l;
        while (i<n1 && j<n2) {
            if(left[i]<=right[j]){
                arr[k]=left[i];i++;k++;
            }else{
                arr[k]=right[j];j++;k++;
            }
        }
        while (i<n1) {
            arr[k]=left[i];i++;k++;
        }
        while (j<n2) {
            arr[k]=right[j];j++;k++;
        }
    }

    //quick sort

    // private static void sort(int[] arr, int l, int h) {
    //     // TODO Auto-generated method stub
    //     if(l>=h)return;
    //     int pi = partition(arr,l,h);
    //     sort(arr, l, pi-1);
    //     sort(arr,  pi+1,h);
    // }

    // private static int partition(int[] arr, int l, int h) {
    //     // TODO Auto-generated method stub
    //     int piv = arr[h], si =l;
    //     for(int i=si;i<h;i++){
    //         if(piv>arr[i]){
    //             int t = arr[i];
    //             arr[i]=arr[si];
    //             arr[si]=t;
    //             si++;
    //         }
    //     }
    //     int t = arr[h];
    //     arr[h]=arr[si];
    //     arr[si]=t;
    //     return si;
    // }



}
