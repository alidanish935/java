package Number;

import java.util.Scanner;

public class loopPrctice {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n = in.nextInt();


    // Find the sum of all digits of a number 

        // int sum=0;
        // while(n>0){
        //     int mod = n%10;
        //     sum = sum+mod;
        //     n=n/10;
        // }
        // System.out.print(sum);

    // Count digits of a number

        //  int count =0;
        //  while(n>0){
        //     n=n/10;
        //     count++;
        //  }
        //  System.out.print(count);



    // Find reverse of a number
        // to reverse a no 92 we have to do 20*10+9

        // int rev =0;
        // while(n>0){
        //     int mod = n%10;
        //     rev = rev*10 + mod;
        //     n=n/10;
        // }
        // System.out.print(rev);

            // or simply we can print remainder
        // while(n>0){
        //     int mod = n%10;
        //     System.out.print(mod);
        //     n=n/10;
        // }

    // Print the even digits of a number 
            // while (n>0) {
            //     int mod = n%10;
            //     if(mod%2==0){
            //         System.out.print(mod);
            //     }
            //     n=n/10;
            // }

    // Find the sum of even digits of a number 
            // int sum = 0;
            // while(n>0){
            //     int mod = n%10;
            //     if(mod%2==0){
            //         sum += mod;
            //     }
            //     n=n/10;
            // }
            // System.out.print(sum);
    // Count the number of time 1 is present in a number
            // int ct = 0;
            // while(n>0){
            //     int mod = n%10;
            //     if(mod==1){
            //         ct ++;
            //     }
            //     n=n/10;
            // }
            // System.out.print(ct);
    // Check if the number is palindrome (reverse of number is equal to the number)
                
            // int m = n;
            // int rev =0;
            // while(n>0){
            //     int rem = n%10;
            //     rev = rev*10 +rem;
            //     n=n/10;
            // }
            // if(m==rev){
            //     System.out.println(m+" is a palindrome no");
            // }else{
            //     System.out.println(m+" is not a palindrome no");
            // }


    // Count trailing zeros in a number 
                // int ct =0;
                // while(n>0){
                //     int rem = n%10;
                //     if(rem ==0)
                //         ct++;
                //     else
                //         break;
                    
                //     n=n/10;
                // }
                // System.out.print(ct);
            
    // Check whether a number is prime 
       // to check a no is prime if its count ==2

       int count =0;
       for(int i=1;i<=n;i++){
        if(n%i==0)
            count++;
       }
       if(count==2)
            System.out.print("Prime no");
        else
            System.out.print("Not a prime no");

    }
}
