package accio.assignment;

public class noRotation {
    public static void main(String[] args) {
    // Given two numbers n and k,you need to rotate n,k times to the right.If k is negative, rotate n,k times to left.
        int n = 1256;
        int k =1;
        // first of all we need to count the length
        int m = n,count =0;
        while(n!=0){
            n = n/10;
            count++;
        }
        // if k is greater no 
        k = k%count;
        // k is negative elem
        if(k<0){
            k=k+count;
        }
        int quo = m/(int)(Math.pow(10, k));//125
        int rem = m%(int)(Math.pow(10, k));//6

        int ans = rem*(int)(Math.pow(10, count-k))+quo;
        System.out.print(ans);

    }
}
