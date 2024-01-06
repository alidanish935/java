import java.util.Arrays;
import java.util.HashMap;

class first{
    public static void main(String[] args) {
        // int arr[]={1,4,20,8,10,5};
        // int n = arr.length;
        // int sum = 32;

        // int start = 0, end =-1,curr_sum =0;
        // HashMap<Integer,Integer> hm = new HashMap<>();

        // for(int i=0;i<n;i++){//0
        //     curr_sum += arr[i];//1
        //     if (curr_sum == sum) {
        //         end = i;
        //     }
        //     if (hm.containsKey(curr_sum-sum)) {
        //         start = hm.get(curr_sum - sum)+1;
        //         end = i;
        //     }
        //     hm.put(curr_sum,i);
        // }
        // if(end == -1){

        //     System.out.println(sum+" is not found  ");
        // }else{

        //     System.out.println("Sub arr found between "+start +" to "+end);
        // }

        // double a =20,b=3;
        // double c = a/b;
        // System.out.println(c);
        // // double a = 6.3;
        // System.out.println(Math.ceil(a));
        // String s = "my name is danish";
        // String[] arr=s.split(" ");
        // // char arr[]=new char[s.length()];
        // // for(int i=0;i<s.length();i++){
        // //     String str = "";
        // //     arr[i]=s.charAt(i);
        // //     System.out.print(arr[i]);
        // // }
        // System.out.println(Arrays.toString(s.split(" ")));


        // int arr[]={-1,-8,8,-9,6,-3,8};
        // int n = arr.length;

        // int sum =0;int max = Integer.MIN_VALUE;
        // for(int i=0;i<n;i++){//1
        //     sum = sum +arr[i];//-1 -8
        //     if(sum>=max){//-8>=-1
        //         max = sum;//-1
        //     }
        //     if(sum<0){//
        //         sum=0;//0
        //     }
        // }
        // System.out.println(max);


        // Binary search
        int arr[]={2,3,4,5,6,7,8,9};// array must be sorted for binary search
        int n = arr.length;int k = 3;
         
        int st =0;int ed = n-1;
        while(st<=ed){
            int mid = (st+ed)/2;
            
            if(k == arr[mid]){
                System.out.println("key found at "+mid);
                return;
            }
            if(k<arr[mid]){
                ed = mid-1;
            }
            if(k>arr[mid]){
                st = mid+1;
            }
        }
       
    }
}