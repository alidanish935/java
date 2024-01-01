package accio.assignment.string;

import java.util.Arrays;

public class oddEven {
    public static void main(String[] args) {
        // link ->https://course.acciojob.com/idle?question=cea2e14e-f75b-4b4f-9272-d15f10bf1d9a

        String s = "abbbccgi";
        int arr[]=new int[26];int n = arr.length;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int ind = ch - 'a';
            arr[ind]++;
            // System.out.println(a+1);
        }
        System.out.print(Arrays.toString(arr));
    }
}
