package Searching;

public class binarySrch {
    public static void main(String[] args){
        int arr[]={1,3,4,5,8,9};
        int n = arr.length;
        int x = 7;
        // we have to find x using binary search
        int l = 0;// taking starting index 
        int r = n-1;// taking last index 
        while(l <=r){
            int mid = (l+r)/2; // calculating mid
            // firstly we will check in arr[mid] =x , if it is found then we will print mid index 
            // if not found then we will check if x is smaller then mid or greater then mid
            if(arr[mid]==x){
                System.out.println("x is found at "+ mid);
                return;
            }
            //if x is smaller then arr[mid],then we will search on left half i.e.. r=mid-1 
            if(x < arr[mid]){
                r =mid-1;
            }
            //if x is greater then arr[mid],then we will search on right half i.e.. l=mid+1 
            if(x> arr[mid]){
                l = mid + 1;
            }
        }
        System.out.println("x is not found");
    }
}
