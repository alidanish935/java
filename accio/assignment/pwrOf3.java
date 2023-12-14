package accio.assignment;

import java.util.Scanner;

public class pwrOf3 {
    public static void main(String[] args) {
//         Given an integer n, print yes if it is a power of three. Otherwise, print no.
// An integer n is a power of three, if there exists an integer x such that n == 3x
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while(n%3==0 && n!=0){
            n=n/3;
        }
        if(n==1)
            System.out.print("yes");
        else
            System.out.print("no");
        
    }
}
