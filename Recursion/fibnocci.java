package Recursion;

public class fibnocci {
    public static void main(String[] args) {
        //0 1 1 2 3 5 8 13
        System.out.print(fibno(5)+" ") ;
    }
    public static int fibno(int a){
        if(a==1){
            return 0;
        }
        if(a==2){
            return 1;
        }
        return fibno(a-1)+fibno(a-2);
    }
}
