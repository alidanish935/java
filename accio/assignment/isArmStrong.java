package accio.assignment;

public class isArmStrong {
    public static void main(String[] args) {
    //     Write a program to print out all Armstrong numbers between 1 and N.
    // A number is called an Armstrong number if the sum of cubes of each digit of the number is equal 
    // to the number itself.    For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )
    int N = 153;
        for(int i =0;i<N;i++){
            isArmStrng(i,N);
        }
    }
    public static boolean isArmStrng(int indx,int n){
        int m = n;
        int res=0; 
            while(n!=0){
                int a = n%10;
                 res =res+ (a*a*a);
                n=n/10;
            }
        return true;
    }
}
