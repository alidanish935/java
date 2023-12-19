package subArr;

public class allSubArr {
    public static void main(String[] args) {
         int a[] = {3, 5, 2, 4, 6, 4};
        int n = a.length;

        // to calculate elem from index 1 to 4
        // for(int i=1;i<4;i++){
        //     System.out.print(a[i]+" ");
        // }
        
        // to calculate  index of all sub array

        // for(int i=0;i<n;i++){
        //         for(int j=i;j<n;j++){
        //                 System.out.println(i+" "+j);
        //         }
        //         System.out.println();
        // }

        // for(int st=0;st<n;st++){
        //     for(int ed=st;ed<n;ed++){
        //         for(int i=st;i<=ed;i++){
        //             System.out.print(a[i]+" ");
        //         }
        //         System.out.println();
        //     }
        // }

// find the sum of all sub array
        // for(int st = 0;st<n;st++){
        //   for(int ed =st;ed<n;ed++){
        //         int sum =0;
        //         for(int i=st;i<=ed;i++){
        //             sum = sum+a[i];
        //         }
        //         System.out.println(sum);
        //     }
        // }


// find the  max sum  sub array
        // int max = Integer.MIN_VALUE;
        // for(int i=0;i<n;i++){
        //     for(int j=i;j<n;j++){

        //     }
        // }



        // for(int i=0;i<n;i++){//i=0,  i<5
        //     for(int j=i;j<n;j++){//j=0,1  , j<5
        //         for(int k=i;k<=j;k++){// k=i,   k<=0
        //             System.out.print(a[k] + " ");// 
        //         }
        //         System.out.println();
        //     }
           
        // }

        
// 3 5
// 3 5 2
// 3 5 2 1
// 3 5 2 1 6
// 3 5 2 1 6 4
// 5
// 5 2
// 5 2 1
// 5 2 1 6
// 5 2 1 6 4
// 2
// 2 1
// 2 1 6
// 2 1 6 4
// 1
// 1 6
// 1 6 4
// 6
// 6 4
// 4
        // for(int st=0;st<n;st++){// 0
        //     for(int ed = st;ed<n;ed++){// 0    1<6
        //         // System.out.println(st+" "+ed);
        //         for(int i=st;i<=ed;i++){// 0  0<=1
        //             System.out.print(a[i]+" ");//3
        //         }
        //         System.out.println();
        //     }
        // }
        
        // for(int st = 0; st < n; st++) {
        //     for(int ed = st; ed < n; ed++) {         
        //         for(int i = st; i <= ed; i++) {
        //             System.out.print(a[i] + " ");
        //         }
        //         System.out.println();
                
        //     }
        // }

        
        // find all the index of sub array in array
        // for(int i=0;i<n;i++){
        //         for(int j=i;j<n;j++){
        //                 System.out.println(i+ " "+ j);
        //         }
        //         System.out.println();
        // }

        // print all subarray elem in array
        // for(int i=0;i<n;i++){
        //         for(int j=i;j<n;j++){
        //                 for(int k=i;k<=j;k++){
        //                         System.out.print(a[k]+" ");
        //                 }
        //                 System.out.println();
        //         }
        // }

// print all subarray elem whose sum is greater then middle elem
        int mid = a[n/2];
        for(int i=0;i<n;i++){
                for(int j=i;j<n;j++){
                        int sum =0;
                        for(int k=i;k<=j;k++){
                           sum = sum+a[k];
                        }
                        if(sum>mid){
                         for(int k=i;k<=j;k++){
                                System.out.print(a[k]+" ");
                         }
                         System.out.println();
                        }
                }
        }
    }
}
