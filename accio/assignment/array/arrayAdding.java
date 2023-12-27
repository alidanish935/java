package accio.assignment.array;

import java.util.Arrays;

public class arrayAdding {
    public static void main(String[] args) {

      // lecture 19 december2023
    //     int n =2,m=4;
    //     int a[]={2,1};
    //     int b[]={1,2,3,4}; // output = 1,2,5,5

      

    //     int len = Math.max(n,m);
    //   int arr[]=new int[len+1];
    //   int sum=0;
    // int carry = 0;
    //   int j=n-1,k=m-1;// j=1 , k=3

    //   for(int i=0;i<len;i++){//   0<2   0<4 
    //       if(i<n && i<m){//3  
    //           sum = a[j]+b[k]+carry;
    //           carry = 0;
    //           j--;//0
    //           k--;//2
    //          arr[i]= sum%10;//5 5
    //           carry = sum/10;
    //       }
    //       else if(i<=m){
    //           arr[i]=b[k];
    //           k--;
    //       }
    //       else if(j<=n){
    //           arr[i]=a[j];
    //           j--;
    //       }
    //   }
     
    //   if(carry>0){
    //       arr[len]=carry;
    //   }
    //   int arr2[]=new int[len];
    //   if(carry==0){
    //       for(int i=0;i<arr.length-1;i++){
    //           System.out.println("arr - "+arr[i]);
    //           arr2[i]=arr[i];
    //           System.out.println(arr2[i]);
    //       }
    //       return ;
    //   }
    // int l = arr.length;
    //   for(int i=0;i<l/2;i++){
    //       int temp = arr[i];
    //       arr[i] = arr[l-1-i];
    //       arr[l-1-i]= temp;
    //   }
    //       // Arrays.reverse(arr);
    //   System.out.println(Arrays.toString(arr));








         //     int r = Math.max(n, m) + 1;
    // int res[] = new int[r];

    // int i = n-1;
    // int j = m-1;
    // int k = r-1;

    //   int c = 0;

    //   while(i >= 0 && j >= 0) {
    //       int sum = a[i] + b[j] + c;
    //       res[k] = sum % 10;
    //       c = sum / 10;

    //       i--;
    //       j--;
    //       k--;
    //   }

    //   while(j >= 0) {
    //       int sum = b[j] + c;
    //       res[k] = sum % 10;
    //       c = sum / 10;

    //       j--;
    //       k--;
    //   }

    //   while(i >= 0) {
    //       int sum = a[i] + c;
    //       res[k] = sum % 10;
    //       c = sum / 10;

    //       i--;
    //       k--;
    //   }

    //   res[k] = c;

    //   if(c == 0) {
    //       int res2[] = new int[r-1];
    //       for(int p = 1; p < r; p++) {
    //           res2[p-1] = res[p];
    //       }
    //       return res2;
    //   }

    //   return res;





        int n =2,m=4;
        int a[]={5,6,2,1}, b[]={3,2,3,4}; // output = 1,2,5,5

        int len = Math.max(n,m);
      int arr[]=new int[len+1], sum=0, carry = 0;
      int j=n-1,k=m-1, r=len;// j=1 , k=3

      for(int i=0;i<len;i++){
        if(i<n && i<m){
            sum=a[j]+b[k]+carry;
            arr[r]=sum%10;
            carry=sum/10;
            k--;
            j--;
            r--;
        }
        else if(i<=m){
            arr[r]=b[k];
            r--;
            k--;
        }
        else if(j<=n){
            arr[r]=a[j];
            r--;
            j--;
        }
      }
      System.out.println(Arrays.toString(arr));
      if(carry>0){
        arr[len]=carry;
      }
      int arr2[]=new int[len];
      if(carry==0){
        for(int i=1;i<len;i++){
            arr2[i-1]=arr[i];
            System.out.print(arr2[i]+" ");
        }
        return;
      }
      System.out.println(Arrays.toString(arr));
    }
}
