package Recursion;

public class ArrayPractice {
    public static void main(String[] args) {
        int arr[] = {3,9,4,1,8,2,4};
        int n = arr.length;
        // printarr(arr,0);
        // printarr(arr,n-1);
        // int max = findMax(arr,0);
        // System.out.println(max);

        // int k =4;
        // int first = firstOccur(arr,0,k);
        // System.out.println(first);

        // int k =4;
        // printAllOccurOfK(arr,n,k);

        // int k =4;
        // int last = lastOccur(arr,n-1,k);// start from end
        // System.out.println(last);

        // int k =4;
        // int last = lastOccur(arr,0,k);// start from starting
        // System.out.println(last);
        
        int k =4;
        int ct = countK(arr,0,k);
        System.out.println(ct);
    }

    private static int countK(int[] arr, int idx, int k) {
        // TODO Auto-generated method stub
        if(idx == arr.length)return 0;

        if(arr[idx]== k){
            return 1+countK(arr, idx+1, k);
        }
        return countK(arr, idx+1, k);
    }

    // private static int lastOccur(int[] arr,int idx ,int k) {
    //     // TODO Auto-generated method stub
    //     int n = arr.length;
    //     if(idx == n)return -1;// if index reach end but not found k, so return -1;
    //     int ans = lastOccur(arr, idx+1, k);//check if after me k is present
    //     if(ans!= -1){//if k is present so curr index is not answer but last found
    //         return ans;
    //     }
    //     if(arr[idx]==k) return idx;//if after me there is no k, and if k is 
    //     //present at curr index so curr idx is ans
    //     return -1;// k is neither present after me nor at me so return -1 to prev func call
    // }

    // private static void printAllOccurOfK(int[] arr,int n ,int k) {
    //     // TODO Auto-generated method stub
    //     if(n-1 <0)return ;
    //     printAllOccurOfK(arr, n-1, k);
    //     if(arr[n-1]==k){
    //         System.out.print(n-1+" ");
    //     }
    // }
    // private static int lastOccur(int[] arr,int idx ,int k) {
    //     // TODO Auto-generated method stub
    //     if(idx <0)return -1;
    //     if(arr[idx]==k)return idx;
    //     return lastOccur(arr, idx-1, k);
    // }
    // private static int firstOccur(int[] arr,int idx ,int k) {
    //     // TODO Auto-generated method stub
    //     if(idx == arr.length-1)return -1;
    //     if(arr[idx]==k)return idx;
    //     return firstOccur(arr, idx+1, k);
    // }
    // private static int findMax(int[] arr,int idx) {
    //     // TODO Auto-generated method stub
    //     if(idx == arr.length-1)return arr[idx];
    //     int max = findMax(arr, idx+1);
    //     return Math.max(arr[idx],max);
    // }
    // private static void printarr(int[] arr,int n) {
    //     // TODO Auto-generated method stub
    //     if(n < 0)return;
    //     printarr(arr, n-1);
    //     System.out.print(arr[n]+" ");
    // }
    // private static void printarr(int[] arr,int idx) {
    //     // TODO Auto-generated method stub
    //     if(idx == arr.length)return;
    //     System.out.print(arr[idx]+" ");
    //     printarr(arr, idx+1);
    // }
}
