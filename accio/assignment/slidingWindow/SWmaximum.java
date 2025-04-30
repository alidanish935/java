package accio.assignment.slidingWindow;

public class SWmaximum {
    public static void main(String[] args) {
        // maximum sum of k consucutive elem
        int arr[]={100,200,500,300,400};
        int n = 4,k=2;

        int max = Integer.MIN_VALUE;
        for(int i=0;i<=n-k;i++){
            int sum = 0;
            for(int j=i;j<i+k;j++){
                sum = sum+arr[j];
            }
            max = Math.max(sum,max);
        }
        System.out.println(max);
    }
}
