package Array;

import java.util.ArrayList;

public class index {
    public static void main(String[] args) {
        int arr[]={2,3,3,2,5};
        int n = arr.length;
        ArrayList<Integer>list = new ArrayList<>();

        list.add(0,arr[4]);
        // for(int i=0;i<n-1;i++){
        //     list.add(i+1,arr[i]);
        // }
        System.out.println(list);
    }
}
