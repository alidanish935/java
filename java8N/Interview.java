package java8N;

class Interview {
    public static void main(String args[]){
        //         Can palindrome be formed?
        // Given a string, check if palindrome can be formed by rearranging its characters.
         
        // Ex1. string: bangalore ans : false
        // Ex2. string: abdybayd ans : true
                String  str = "abba";
                int n = str.length();
                int left = 0;
                int right = n-1;
         
                while(left<right){
                    if(str.charAt(left) != str.charAt(right)){
                        System.out.println(false);return;
                    }
                    left++;
                    right--;
                }
                System.out.println(true);
            }
}
