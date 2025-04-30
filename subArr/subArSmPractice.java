package subArr;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class subArSmPractice {
    public static void main(String[] args) {
        int arr[]={2,8,2,6,-6,3,2};
        int k=5;int n = arr.length;

    //qn1 check if subarray exist or not with given sum
  //  check(arr, n,k);
    
    //qn2 find start and end index if subarray exist  with given sum
    //findIndex(arr, n,k);

    //qn3 find start and end index if Largest subarray exist  with given sum
    // findIndexLarSubArr(arr, n,k);


    //qn3 find start and end index if Largest subarray exist  with given sum
    SbArWthLarSm(arr, n,k);


    //qn4 find start and end index if Largest subarray exist  with given sum
    SbArWthLarSm(arr, n,k);
    }

    private static void SbArWthLarSm(int[] arr, int n,int k){//{2,8,2,6,-6,3,2};
        // TODO Auto-generated method stub
        HashMap<Integer,Integer>hm = new HashMap<>();
        hm.put(0, -1);int sum=0,maxLen =0;
        int start =-1 , end =-1;
        for(int i=0;i<n;i++){
            sum += arr[i];
            if(hm.containsKey(sum-k)){
                if(i-hm.get(sum-k)>maxLen){
                    start= hm.get(sum-k);
                    end=i;
                    maxLen=end-start;
                }
            }else{
                hm.put(sum, i);
            }
        }
        int ans[]=new int[maxLen];int j=0;
        for(int i=start+1;i<=end;i++){
            ans[j]=arr[i];j++;
        }
        System.out.println(Arrays.toString(ans));
    }

    private static void findIndexLarSubArr(int[] arr, int n, int k) {
        // TODO Auto-generated method stub
        HashMap<Integer,Integer> hm =new HashMap<>();
        hm.put(0,-1);
        int sum = 0;int maxLen = 0;
        int start =-1,end =-1;
        for(int i=0;i<n;i++){
            sum += arr[i];
            if(hm.containsKey(sum-k)){
                if(i-hm.get(sum-k) > maxLen){
                    start =hm.get(sum-k);
                    end = i;
                    maxLen = end - start;
                }
            }else{
                hm.put(sum, i);
            }
        }
        System.out.println(start +" -> "+end);
    }

    private static void findIndex(int[] arr, int n, int k) {//{2,8,2,6,-6,3,2};
        // TODO Auto-generated method stub
        HashMap<Integer,Integer>hm = new HashMap<>();
        hm.put(0, -1);
        int sum = 0;int start=-1;int end =-1;
        for(int i=0;i<n;i++){
            sum = sum+arr[i];
            if(hm.containsKey(sum-k)){
                start = hm.get(sum-k)+1;
                end=i;
            }else{
                hm.put(sum, i);
            }
        }
        System.out.println(start +" - "+end);
    }

    private static void check(int[] arr, int n, int k) {
        // TODO Auto-generated method stub
        HashSet<Integer> set = new HashSet<>();
        set.add(0);
        int sum=0;
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
}
