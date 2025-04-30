package accio.assignment.stack;

import java.util.*;

class Solution{
    // its correct but some cases are not handled in while loop (create issue in leetcode) 
//     public static boolean checkValidString(int n, String s){
//         //write code here
//        Stack<Integer> st1 = new Stack<>();
//        Stack<Integer> st2 = new Stack<>();
//       //  boolean isValid = true;int open =0;
//         for(int i=0;i<n;i++){
//             char ch = s.charAt(i);
//             if(ch=='('){
//                 st1.push(i);
//             }else if(ch == '*'){
//                 st2.push(i);
//             }else{
//                 if(st1.size()>0 ){
//                     st1.pop();
//                 }else if(st2.size()>0){
//                     st2.pop();
//                 }else{
//                     return false;
//                 }
//             }
//         }
//         while(st1.size()>0 && st2.size()>0){
//             if(st1.peek()<st2.peek()){
//                 st1.pop();
//             }else{
//                 return false;
//             }
//         }
//         return true;
//     }
// }
    public static boolean checkValidString(int n, String s){
        //write code here
       // Approach -> 
        //1. keeping 2 stacks to store open bracket and aestrick,we will simply push open bracket and aestrick into their stacks
        //2.if we get ch == ')', then will check if extraOpenBracket.size()>0 means we can balance them so pop it
            // will also check aestrick.size()>0 so pop it ,if neither of them(2)is true means its invalid string
            //eg.()*)(*)) here for last 2 close bracket there is no open bracket or aestrick(*) so its invalid so return false
        //3. for this eg.()*)(* ,after for loop ,one open brack and 1 * will be there in both stack 
            //our aim to make extraOpenBracket stack empty but if aestrick stack is empty but extraOpenBracket is not empty means invalid so return false(1st cond. in while loop)
        // 4. ()*)*( , for this case there is 1 extraOpenBracket and 1 aestrick in their stack but index of aestrick is smaller so its invalid return false
        //5. at the end if extraOpenBracket.isEmpty() return true else false;

// Note :- Here i am pushing index instead of char bcz to handle case 4 i need to compare index -> if  (extraOpenBracket.pop() > aestrick.pop()) return false;
            Stack<Integer> extraOpenBracket = new Stack<>();  // Stack to store indices of extra open brackets
            Stack<Integer> aestrick = new Stack<>();         // Stack to store indices of asterisks

            // Traverse the string
            for (int i = 0; i < n; i++) {
                char ch = s.charAt(i);
                // If the current character is an open bracket, push its index to the extraOpenBracket stack
                if (ch == '(') {
                    extraOpenBracket.push(i);
                }
                // If the current character is an asterisk, push its index to the aestrick stack
                else if (ch == '*') {
                    aestrick.push(i);
                }
                // If the current character is a closing bracket
                else {
                    // If there are open brackets that can be matched, pop one from the extraOpenBracket stack
                    if (!extraOpenBracket.isEmpty()) {
                        extraOpenBracket.pop();
                    }
                    // If there are asterisks that can be used as open brackets, pop one from the aestrick stack
                    else if (!aestrick.isEmpty()) {
                        aestrick.pop();
                    }
                    // If neither open brackets nor asterisks are available to match the closing bracket, return false
                    else {
                        return false;
                    }
                }
            }
            
            // Matching open brackets with asterisks if any
            while (!extraOpenBracket.isEmpty()) {
                // If there are no more asterisks to match, return false
                if (aestrick.isEmpty()) return false;
                // If the index of the open bracket is greater than the index of the asterisk, return false
                if (extraOpenBracket.pop() > aestrick.pop()) {
                    return false;
                }
            }
            
            // If all extra open brackets are matched by asterisks, return true if no extra asterisks left
            return extraOpenBracket.isEmpty();
    }
}

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        String s = sc.next();
        Solution obj = new Solution();
        boolean ans = obj.checkValidString(n,s);
        if(ans==true){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}