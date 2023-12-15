package Array;

import java.util.Arrays;

public class secLargElem {
    public static void main(String[] args) {
        int arr[] = {3,2,6,5,9,8,9};
        int n = arr.length;//2,3,5,6,8,9
        int lar = Integer.MIN_VALUE,indx = -1,secMax=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>lar){
                lar = arr[i];
                indx = i;
            }
        }
        for(int i=0;i<n;i++){
            if(i!=indx && arr[i]>secMax && arr[i]!=lar){
                secMax = arr[i];
            }
        }
		System.out.println(lar);//6-3=3
		System.out.print(secMax);//6-3=3
    }
}

