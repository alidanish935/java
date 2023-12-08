package String;

public class swap {
    public static void main(String[] args) {
        // Input---  12345   Output-->  52341
        int num = 12345;
        String str = Integer.toString(num);
        int n =str.length();
        // String ans = "";
        if(n>1){
            char first = str.charAt(0);
            char last = str.charAt(n-1);
            String ans = last + str.substring(1,n-1)+first;
            System.out.println(Integer.parseInt(ans));
        }else{
           System.out.println(num);
        }

    }
}
