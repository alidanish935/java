package Array;

public class allSbArr {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5} ;// output -> 1 , 1 2 ,1 2 3 , 1 2 3 4 , 1 2 3 4 5 ,2, 2 3 , 2 3 4 ,
        //  2 3 4 5 ,3, 3 4 , 3 4 5 ,4, 4 5 , 5
        for(int i=0;i<5;i++){
            for(int j=i;j<5;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k] +" ");
                }
                System.out.println();
            }
        }
    }
}
