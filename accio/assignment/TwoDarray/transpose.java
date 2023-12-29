package accio.assignment.TwoDarray;

public class transpose {
    public static void main(String[] args) {
        // link  -> https://course.acciojob.com/idle?question=13c0380b-4ebc-4091-9eb7-7216e5a5a64c
        int arr[][]={ {1 ,2 ,3},{4 ,5 ,6},{7 ,8 ,9}};
        int n= arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
}
