package accio.assignment.TwoDarray;

public class basic {
    public static void main(String[] args) {
        int a[][] = { { 1, 2, 3 },
                { 3, 4, 4 },
                { 3, 5, 7 },
                { 4, 6, 8 }
        };

        int n = a.length;
        int m = a[0].length;

        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < m; j++) {
        //         System.out.print(a[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        // print column wise (transpose)

        // for(int i=0;i<m;i++){//3
        //     for(int j=0;j<n;j++){//4
        //         System.out.print(a[j][i]+" ");
        //     }
        //     System.out.println();
        // }


        // int a[][] = { { 1, 2, 3 },
        //         { 3, 4, 4 },
        //         { 3, 5, 7 },
        //         { 4, 6, 8 }
        // };

        // int n = a.length;
        // int m = a[0].length;
        // print column wise
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[j][i]+" ");
            }
        }
    }
}
