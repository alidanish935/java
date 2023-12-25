package accio.contest.december;

public class secLarPrime {
    public static void main(String[] args) {
        // link  ->   https://course.acciojob.com/idle?question=6e1969c9-8f67-4591-9400-ad57bcf2f2c3
    
        int arr[]={2,4,5,3,8,9,11};   // output -5
        int n=arr.length;
        int ct=0;
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        // 7 7 7 7       2 2 4 8 23 23
        // i
       for(int i=0;i<n;i++){
           if(isPrime(arr[i])){
               ct++;
               if(arr[i]>max1){
                   max2=max1;
                   max1=arr[i];
               }else if(arr[i]>max2 && arr[i]<max1){// if max2=2 and max=5 then 3 will satisfy this condition
                   max2 = arr[i];
               }
           } 
       }
        if(ct<2){
            System.out.println(-1);
            return ;
        }
        System.out.println(max2);
    }
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
