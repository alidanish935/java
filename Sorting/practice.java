package Sorting;

import java.util.Arrays;

public class practice {
    public static void main(String[] args) {
        int arr[]={12,1,4,2,7,9,5};//1,4, 2,5,7,9,12
        int n = arr.length;//               st     i
        sort(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }
    // -------------------  merge sort -------------------
    public static void sort(int arr[],int l,int r){//{12,1,4,2,7,9,5};
        if(l>=r)return;
        int mid = (l+r)/2;
        sort(arr, l, mid);
        sort(arr,  mid+1,r);
        merge(arr,l,mid,r);
    }
    public static void merge(int arr[],int l,int mid,int r){//{12,1,4,2,7,9,5};
        int n1 = mid-l+1;int n2 = r-mid;
        int left[]=new int[n1];
        int right[]=new int[n2];

        for(int i=0;i<n1;i++){
            left[i]=arr[l+i];
        }
        for(int i=0;i<n2;i++){
            right[i]=arr[mid+1+i];
        }
        int i=0,j=0,k=l;
        while(i<n1 && j<n2){
            if(left[i]<=right[j]){
                arr[k]=left[i];i++;k++;
            }else{
                arr[k]=right[j];j++;k++;
            }
        }
        while(i<n1){
            arr[k]=left[i];i++;k++;
        }
        while(j<n2){
            arr[k]=right[j];j++;k++;
        }
    }
    // -------------------  quick sort -------------------
//     public static void sort(int arr[],int l,int r){//{12,1,4,2,7,9,5};
//     if(l>=r)return;
//     int piv = partition(arr,l,r);
//     sort(arr, l, piv-1);
//     sort(arr, piv+1,r);
// }
//     public static int partition(int arr[],int l,int r){//{12,1,4,2,7,9,5};
//         int piv = arr[r],st = l;

//         for(int i=st;i<r;i++){
//             if(piv>arr[i]){
//                 int t = arr[i];
//                 arr[i]= arr[st];
//                 arr[st]=t;st++;
//             }
//         }
//         int t = arr[r];
//         arr[r]=arr[st];
//         arr[st]=t;
//         return st;
//     }






    // -------------------  merge sort -------------------
    // public static void sort(int arr[],int l,int r){//{12,1,4,2,7,9,5};
    //     if(l>=r) return;
    //     int mid = (l+r)/2;
    //     sort(arr, l, mid);
    //     sort(arr,  mid+1,r);
    //     merge(arr,l,mid,r);
    // }
    // public static void merge(int arr[],int l,int mid,int r){//{12,1,4,2,7,9,5};
    //     int n = mid -l+1;int m = r-mid;
    //     int left[] = new int[n]; int right[] = new int[m];
    //     for(int i=0;i<n;i++){
    //         left[i]=arr[l+i];
    //     }
    //     for(int i=0;i<m;i++){
    //         right[i]=arr[mid+i+1];
    //     }
    //     int i=0,j=0,k=l;
    //     while(i<n&&j<m){
    //         if(left[i]<right[j]){
    //             arr[k]=left[i];k++;i++;
    //         }
    //         else{
    //             arr[k]=right[j];k++;j++;
    //         } 
    //     }
    //     while(i<n){
    //         arr[k]= left[i];k++;i++;
    //     }
    //     while(j<m){
    //         arr[k]= right[j];k++;j++;
    //     }

    // }





    // -------------------  quick sort -------------------

    // public static void sort(int arr[],int l,int r){//{12,1,4,2,7,9,5};1st step -1,4,2,12,7,9,5
    //     if(l>r) return;
    //     int piv = partition(arr,l,r);
    //     sort(arr,l,piv-1);
    //     sort(arr,piv+1,r);
    // }
    // public static int partition(int arr[],int l,int r){//{ 12 , 1 , 4 , 2 , 7 , 9 , 5 } 
    //     int piv = arr[r];int st = l;             //                  i
    //     for(int i=st;i<r;i++){                  //{ 1 , 4 , 2 , 12 , 7 , 9 , 5 } 
    //         if(arr[i]<piv){                     //              s
    //             int temp = arr[i];
    //             arr[i]=arr[st];
    //             arr[st]=temp;
    //             st++;
    //         }
    //     }
    //     // System.out.println(arr[r]+"  ---  "+piv);
    //     int temp = arr[st];
    //     arr[st]=arr[r];
    //     arr[r] = temp;
    //      // System.out.println(Arrays.toString(arr));
    //     return st;
    // }





    // -------------------  quick sort -------------------

    // public static void sort(int arr[],int l,int h){
    //     if(l>=h) return;
    //     int piv = partition(arr,l,h);
    //     sort(arr,l,piv-1);
    //     sort(arr,piv+1,h);
    // }
    // public static int partition(int arr[],int l,int h){
    //     int piv =arr[h], st = l;
    //     for(int i=l;i<h;i++){
    //         if(arr[i]<piv){
    //             int t = arr[i];
    //             arr[i]=arr[st];
    //             arr[st]=t;
    //             st++;
    //         }
    //     }
    //     int t = arr[h];
    //     arr[h]=arr[st];
    //     arr[st]=t;
    //     return st;
    // }
    







    // -------------------  quick sort -------------------
    // public static void sort(int arr[],int l,int h){
    //     if(l>=h)return;
    //     int piv = partiton(arr,l,h);
    //     sort(arr,l,piv-1);
    //     sort(arr,piv+1,h);
    // }
    // public static int partiton(int arr[],int l,int h){
    //     int piv = arr[h];int st =l;
    //     for(int i=l;i<h;i++){
    //         if(piv>arr[i]){
    //             int t = arr[i];
    //             arr[i]=arr[st];
    //             arr[st]=t;
    //             st++;
    //         }
    //     }
    //     int t =arr[st];
    //     arr[st]=arr[h];
    //     arr[h]=t;
    //     return st;
    // }

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
