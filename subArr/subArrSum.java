package subArr;

import java.util.HashMap;
import java.util.HashSet;

public class subArrSum {
    public static void main(String[] args) {
        int arr[]={2,8,2,6,-6,3,2};
        int k=5;int n = arr.length;

    //qn1 check if subarray exist or not with given sum
    // check(arr, n,k);
    
    //qn2 find start and end index if subarray exist  with given sum
    // findIndex(arr, n,k);

    //qn3 find start and end index if Largest subarray exist  with given sum
    findIndexLarSubArr(arr, n,k);


    

    }
    public static void check(int arr[],int n,int k){
        // brute force approach
        
        //   for(int i=0;i<n;i++){
        //     int sum=0;
        //     for(int j=i;j<n;j++){
        //         sum += arr[j];
        //         if(sum==k){
        //             System.out.println(true);return;
        //         }
        //     }
        // }
        // System.out.println(false);return;
        
        // optimise way
        HashSet<Integer> set = new HashSet<>();
        set.add(0);int sum=0;
        for(int i=0;i<n;i++){
            sum += arr[i];
            if(set.contains(sum-k)){
                System.out.println(true);return;
            }else{
                set.add(sum);
            }
        }
        System.out.println(false);return;
    }
    public static void findIndex(int arr[],int n,int k){//{2,8,2,6,-6,3,2};
    HashMap<Integer,Integer> hm = new HashMap<>();
    int ans[]=new int[2];
    hm.put(0,-1);int sum =0;
    for(int i=0;i<n;i++){
        sum=sum+arr[i];
        if(hm.containsKey(sum-k)){
            ans[0]=hm.get(sum-k)+1;
            ans[1]=i;
        }else{
            hm.put(sum, i);
        }
    }
    System.out.println(ans[0]+" - "+ans[1]);
}
public static void findIndexLarSubArr(int arr[],int n,int k){//{2,8,2,6,-6,3,2};
    HashMap<Integer,Integer> hm = new HashMap<>();
    int ans[]=new int[2];
    hm.put(0,-1);int sum =0;int max=Integer.MIN_VALUE;

    for(int i=0;i<n;i++){
        sum += arr[i];
        if(hm.containsKey(sum-k)){
            int st = hm.get(sum-k);
           // System.out.print(i-st+" - "+max+ " -> ");
            if(i-st >max){
                ans[0]=hm.get(sum-k)+1;
                ans[1]=i;
                max =i-st;
            }
        }else{
            hm.put(sum,i);
        }
    }
    
    System.out.println(ans[0]+" - "+ans[1]);

  }
}
