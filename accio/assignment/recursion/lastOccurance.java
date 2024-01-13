package accio.assignment.recursion;

public class lastOccurance {
    public static void main(String[] args) {
        // link    https://course.acciojob.com/idle?question=fbaf4602-2548-4ec7-83ee-aa74c66fe931
        int arr[]={8 ,9 ,4 ,1 ,1 ,2}; // output 4 (last index of 1 is 4)
        int t =1;int n = arr.length;
        System.out.println(lastOcc(arr,t,n)) ;
    }
    //first approach 
    public static int lastOcc(int arr[],int t,int n){
        if(n<0) return -1;
        if(arr[n-1]==t) return n-1;
        return lastOcc(arr, t, n-1);
    }
}
