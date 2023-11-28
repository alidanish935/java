package General;

class addDigitRptly {
       // Given an integer num, repeatedly add all its digits until the result has only one digit, and return it
    public static void main(String[] args){
        int n = 38;
        
        while (n>9) {
            int res = 0;
            while(n!=0){
                res += n%10;
                n=n/10;
            }
            n = res;
        }
        System.out.println(n);
    }
}
