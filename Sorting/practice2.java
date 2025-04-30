package Sorting;

import java.util.Arrays;

public class practice2 {
    public static void main(String[] args) {
        int arr[]={12,1,4,2,7,9,5};//1,4, 2,5,7,9,12
        int n = arr.length;//               st     i



        // bubble sort
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int t = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }


        // selection sort

        for(int st =0;st<n;st++){
            int min = Integer.MAX_VALUE; int mni = -1;
            for(int i=st;i<n;i++){
                if(arr[i]<min){
                    min = arr[i];
                    mni =i;
                }
            } 
            int t = arr[st];
            arr[st]=arr[mni];
            arr[mni]=t;
        }
        // System.out.println(Arrays.toString(arr));



        // selection sort in string
        String a[]={"aa","ab","abc","a","bcd","bad","aaaa"};
        int k = a.length;
        for(int st=0;st<k;st++){
            int mni = st;//0
            for(int j=st;j<k;j++){//0 1
                if( a[j].compareTo(a[mni])<0 ){//1 <7 && 
                    mni = j;
                }
            }
            String t = a[mni];
            a[mni]=a[st];
            a[st]=t;
        }
        System.out.println(Arrays.toString(a));
    }
}
