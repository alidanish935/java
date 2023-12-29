package Array;

import java.util.Arrays;

public class reverse {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int n = arr.length;
        int st=0,ed=n-1;
        while (st<ed) {
            int t = arr[st];
            arr[st]=arr[ed];
            arr[ed]=t;
            st++;
            ed--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
