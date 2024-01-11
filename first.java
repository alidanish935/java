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
        // int arr[]={2,3,4,5,6,7,8,9};// array must be sorted for binary search
        // int n = arr.length;int k = 3;
         
        // int st =0;int ed = n-1;
        // while(st<=ed){
        //     int mid = (st+ed)/2;
            
        //     if(k == arr[mid]){
        //         System.out.println("key found at "+mid);
        //         return;
        //     }
        //     if(k<arr[mid]){
        //         ed = mid-1;
        //     }
        //     if(k>arr[mid]){
        //         st = mid+1;
        //     }
        // }

        // int a[]={9,2};int n = a.length;
        // int b[]={4,2};int m = b.length;
        // int r = Math.max(n, m);
        
        // int ans[]=new int[r+1];int s=ans.length;
        // int p = n-1,q=m-1,k=s-1;
        
        // int c=0;
        // for(int i=0;i<r;i++){
        //     if(p>=0 && q>=0){
        //         int sum = a[p]+b[q]+c;
        //         ans[k]=sum%10;
        //         c= sum/10;
        //         p--;q--;k--;
        //     }
        //     else if(p>=0){
        //         ans[k]=a[p]+c;k--;p--;
        //     }
        //     else if(q>=0){
        //         ans[k]=b[q]+c;k--;q--;
        //     }
        // }
        // int ans2[]=new int[r];
        // if(c==0){
        //     int l=0;
        //     for(int i=1;i<=r;i++){
        //         // ans2[l]=ans[i];l++;
        //         System.out.print(ans[i]+" ");
        //     }
        //     // return;
        // }
        // else if(c>0){
        //     ans[0]=c;
        //     for(int i=0;i<r+1;i++){

        //    System.out.print(ans[i]+" ");
        // }
        // }
       // ABCD 

        // input ->  abbbccd      Output: ab3c2d

      String s ="abbbccd";
      StringBuilder res = new StringBuilder("");
      int n=s.length();
      for(int i=0;i<n;i++){//1
        int ct=1;
        int j=i;//1
        while(j+1<n && s.charAt(j)==s.charAt(j+1)){
            j++;
        }
        ct = j+1-i;
        res.append(s.charAt(i)+""+ct);
        i=j;
      }
      System.out.println(res);
    }
}