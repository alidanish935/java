package accio.assignment.recursion;

public class array11 {
    public static void main(String[] args) {
        // link     https://course.acciojob.com/idle?question=fad89b8e-c73f-4a75-9de6-a5b045e60394
        int arr[]= {1 ,3, 11, 11, 2}; // output -> 2 (ct of 11 in arr)
        int n = arr.length;
        // System.out.println(array11(arr, 0));
        System.out.println(array11(arr, 0,0));
    }
    public static int array11(int arr[],int idx){
        if(idx == arr.length) return 0;
        if(arr[idx]==11) return 1+array11(arr, idx+1);
        return array11(arr, idx+1);
    }
    // 2nd approach
    static int array11(int[] a, int ind,int ct) {
        //Write your code here
        if(ind == a.length) return ct;
        if(a[ind]==11) ct++;
        return array11(a,ind+1,ct);
         
    }
}
