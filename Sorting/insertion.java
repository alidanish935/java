package Sorting;

public class insertion {
    public static void main(String[] args) {
        int arr[]={2,4,6,8,3};
        int n = arr.length;
        int temp,j;
        for(int i=0;i<n;i++){
            temp = arr[i];
            j=i;
            while(j>0 && temp<arr[j-1]){
                arr[j]=arr[j-1];
                j--;
            }
            arr[j]=temp;
        }
    }
}
