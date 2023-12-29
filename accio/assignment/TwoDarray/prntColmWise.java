package accio.assignment.TwoDarray;

public class prntColmWise {
    public static void main(String[] args) {
        int arr[][]={ {1 ,2 ,3},{4 ,5 ,6},{7 ,8 ,9}};
        int n= arr.length,m=arr[0].length;

        // print row wise
        for(int r=0;r<n;r++){
            for(int c=0;c<n;c++){
                System.out.print(arr[r][c]+" ");
            }
            System.out.println();
        }
        System.out.println();

        // print column wise
        for(int c=0;c<n;c++){
            for(int r=0;r<n;r++){
                System.out.print(arr[r][c]+" ");
            }
            System.out.println();
        }
    }
}
