package Recursion.array;

public class printArr {
    public static void main(String[] args) {
        int arr[]={1,2,3,9,5,6};
        // int s =sumArr(arr,0);
        // System.out.println(s);
        int max = Integer.MIN_VALUE;
        int s =maxInArr(arr,0,max);
        System.out.println(s);
    }
    public static int maxInArr(int arr[],int i,int max){
        if(i==arr.length){
            return max;
        }
        if(arr[i]>max) max = arr[i];

        return maxInArr(arr, i+1, max);

    }
    public static int sumArr(int arr[],int i){
        if(i==arr.length){
            return 0;
        }
        return arr[i]+sumArr(arr, i+1);
    }
}
