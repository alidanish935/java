package accio.assignment.recursion.integer;

public class recrsvFactorial {
    public static void main(String[] args) {
        // https://course.acciojob.com/idle?question=f661b0e4-7bc4-469b-b148-8b77c9bca468
        int n=5;
        System.out.println(fact(n));
    }
    public static int fact(int n){
        if(n==0) return 1;
        return n*fact(n-1);
    }
}
