package String;

import java.util.Arrays;
import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        // String str = "danish";
        // // String ans = "";
        // int n = str.length();
        // // for(int i=0;i<n;i++){
        // //     ans=str.charAt(i);
        // // }
        // char first = str.charAt(0);
        // char last = str.charAt(n-1);
        // String ans = last + str.substring(1,n-1)+first;
        // // System.out.println(str.substring(1, n-1));
        // System.out.println(ans);



       String s = "hello";
        int arr[]=new int[26];
        for(int i=0;i<5;i++){
            char ch = s.charAt(i);
            int idx = (int)(ch-'a');
            arr[idx]++;
        }
        int idx = -1;
        for(int i=0;i<26;i++){
            if(arr[i]>1){
                idx= i;
            }
        }
        char ch = (char)(idx+97);
        
        System.out.println(ch);
    }
}
