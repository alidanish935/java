package Array;

import java.util.Arrays;

public class secLargElem {
    public static void main(String[] args) {
        int arr[] = {3,2,6,5,9,8};
        int n = arr.length;//2,3,5,6,8,9
        int lar = 0,indx = 0;
        for(int i=0;i<n;i++){
            if(arr[i]>lar){
                lar = arr[i];
                indx = i;
            }
        }
		System.out.print(lar);//6-3=3
    }
}
