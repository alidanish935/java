package accio.assignment;

import java.util.Scanner;

public class checkPrime {
    public static void main(String[] args) {
        // Given an integer n, print all prime numbers between 1 and n (both inclusive).
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Your code here
        isPrime(n);
        for(int i=1;i<=n;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
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
