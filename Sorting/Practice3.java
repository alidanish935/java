package Sorting;

import java.util.Arrays;

public class Practice3 {
    public static void main(String[] args) {
        int arr[]={3,7,1,9,4,6,8,3};
        int n = arr.length;
        //selection sort

        // for(int st=0;st<n;st++){
        //     int minIdx = st;
        //     for(int i=st;i<n;i++){
        //         if(arr[i]<arr[minIdx]){
        //             minIdx =i;
        //         }
        //     }
        //     int t = arr[st];
        //     arr[st]=arr[minIdx];
        //     arr[minIdx]=t;
        // }


        // bubble sort

        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n-1-i;j++){
        //         if(arr[j]>arr[j+1]){
        //             int t = arr[j];
        //             arr[j]=arr[j+1];
        //             arr[j+1]=t;
        //         }
        //     }
        // }


        // //quicksort

        // quickSort(arr,0,n-1);




        // //mergeSort;
        // mergeSort(arr,0,n-1);


        //   // insertion sort

        for(int i=0;i<n;i++){
            int curr = arr[i];
            int j=i;
            while (j>0 && curr<arr[j-1]) {
                arr[j]=arr[j-1];
                j--;
            }
            arr[j]=curr;
        }
                
        System.out.println(Arrays.toString(arr));
    }
                
           
        
    private static void quickSort(int[] arr, int l, int h) {
        // TODO Auto-generated method stub
        if(l>=h)return;
        int piv = partition(arr,l,h);
        quickSort(arr, l, piv-1);
        quickSort(arr, piv+1,h);
    }
            
    private static int partition(int[] arr, int l, int h) {
        // TODO Auto-generated method stub
        int piv = arr[h],st = l;
        for(int i=st;i<h;i++){
            if(piv>arr[i]){
                int t = arr[i];
                arr[i]=arr[st];
                arr[st]=t;
                st++;
            }
        }
        int t = arr[h];
        arr[h] = arr[st];
        arr[st]=t;
        return st;
    }

    private static void mergeSort(int[] arr, int l, int h) {
        // TODO Auto-generated method stub
        if(l>=h)return;
        int mid = (l+h)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,h);
        merge(arr,l,mid,h);
    }
    private static void merge(int[] arr, int l, int mid, int h) {
        int n1 = mid-l+1; int n2 = h-mid;
        int left[]=new int[n1];int right[]=new int[n2];

        for(int i=0;i<n1;i++){
            left[i]=arr[l+i];
        }
        for(int i=0;i<n2;i++){
            right[i]=arr[mid+i+1];
        }
        int i=0,j=0,k=l;
        // System.out.println(Arrays.toString(left));
        // System.out.println(Arrays.toString(right));
        while(i<n1 &&j<n2){
            if(left[i]<=right[j]){
                arr[k]=left[i];i++;
            }else{
                arr[k]=right[j];j++;
            }
            k++;
        }
        while (i<n1) {
            arr[k]=left[i];i++;k++;
        }
        while (j<n2) {
            arr[k]=right[j];j++;k++;
        }

    }
}
