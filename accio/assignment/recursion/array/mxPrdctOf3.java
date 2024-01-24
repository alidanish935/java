package accio.assignment.recursion.array;

public class mxPrdctOf3 {
    public static void main(String[] args) {
        int arr[]={1,3,5,7};
        int n = arr.length;
        int ans =solve(arr,n,0,1,2);
        System.out.println(ans);
    }
    private static int solve(int[] arr, int n, int i, int j, int k) {
        if(k==n-2) return arr[i]*arr[j]*arr[k];// i=0,1 , n=4 ,j=1,k=2 
        int p1 = solve(arr,n,i+1,j,k);// i=1 ,j=1,k=2  ,75 
        int p2 = solve(arr,n,i,j+1,k);// i=1 ,j=2,k=2 
        int p3 = solve(arr,n,i,j,k+1);// i=1 ,j=2,k=2  
        return Math.max(p1,Math.max(p2,p3));
    }
}
