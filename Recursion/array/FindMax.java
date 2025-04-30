package Recursion.array;

public class FindMax {
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6,2};
        int m = max(arr,0);
        System.out.println(m);
    }
    public static int max(int arr[],int i){
        if(i==arr.length-1)return arr[i];

        return Math.max(arr[i], max(arr, i+1));
    }
}
