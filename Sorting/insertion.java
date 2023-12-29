package Sorting;

public class insertion {
    public static void main(String[] args) {
        int arr[]={3,7,1,9,4,6,8,3};
        int n = arr.length;
        
        for(int i=0;i<n;i++){
            int val = arr[i];//4
            int j=i-1;
            while(j>=0 && arr[j]>val){
                arr[j+1]=arr[j];
                j--;
            }
        }
    }
}
