package Sorting;

import java.util.Arrays;

public class insertion {
    public static void main(String[] args) {
        int arr[]={3,7,1,9,4,6,8,3};
        int n = arr.length;
        
        // for(int i=0;i<n;i++){
        //     int val = arr[i];//4
        //     int j=i-1;
        //     while(j>=0 && arr[j]>val){
        //         arr[j+1]=arr[j];
        //         j--;
        //     }
        // }
        for(int i=0;i<n;i++) {//{3,7,1,9,4,6,8,3}->{1,3,7,9,4,6,8,3}
			int temp = arr[i];//3,7,1,9,4
			int j=i;//0,1,2,3,4
			while(j>0 && temp<arr[j-1]) {//1<7
				arr[j]=arr[j-1];//
				j--;//2
			}
			arr[j]=temp;// 1,3, 4 ,7,9
		}
		System.out.println(Arrays.toString(arr));
    }
}
