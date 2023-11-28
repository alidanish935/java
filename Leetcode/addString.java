package Leetcode;

public class addString {
    public static void main(String[] args) {
        // Input: num1 = "11", num2 = "123"        Output: "134"
        String s1 = "11",s2 = "123";
        int n = Integer.parseInt(s1) + Integer.parseInt(s2) ;
        String s = Integer.toString(n) ;
        System.out.println(s);
    }
}
