package accio.contest.janruary.week2;

public class alexAlice {
    public static void main(String[] args) {
        // https://course.acciojob.com/idle?question=b4dfaf91-ed01-447d-b3bc-a34a30b5c38e

        int arr[]={1 ,5,233,7};int n = arr.length;

        boolean ans=solve(n,arr);

		if(ans==true)
		System.out.println("true");

		else
		System.out.println("false");
    }
    public static int findMax(int arr[],int i,int j){
        if(i>j){
            return 0;
        } 
        int first =arr[i]+ Math.min(findMax(arr,i+1,j-1),findMax(arr,i+2,j));
        int second = arr[j]+Math.min(findMax(arr,i+1,j-1),findMax(arr,i,j-2));
        int max = Math.max(first,second);
        return max;
    }
	
    public static boolean solve(int n,int arr[])
    {
        // Your code here
        int sum =0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        int alex = findMax(arr,0,n-1);
        int alice = sum-alex;
        if(alice<alex) return true;
        return false;
    }
}
