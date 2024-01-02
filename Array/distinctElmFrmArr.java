package Array;

import java.util.Arrays;

public class distinctElmFrmArr {
    public static void main(String[] args) {
        int arr[]={1,3,3,2,2,4,4};
        // Arrays.sort(arr);

        for(int i=0;i<7;i++){
            System.out.print(arr[i]+" ");
            while(i+1<7 && arr[i]==arr[i+1]){
                i++;
            }
        }
    }
}
