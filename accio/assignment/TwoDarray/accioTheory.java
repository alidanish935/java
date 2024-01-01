package accio.assignment.TwoDarray;

public class accioTheory {
    public static void main(String[] args) {
         // 2D Array
        
        // int a[][] = {{1, 2, 3},
        //              {3, 4, 4},
        //              {3, 5, 7},
        //              {4, 6, 8}
                    // };
        
        // a[row][column] -> Fixed 
        
        // int n = a.length; // 4 
        // int m = a[0].length; // 3 
        
        // for(int r = 0; r < n; r++) {
        //     for(int c = 0; c < m; c++) {
        //         System.out.print(a[r][c] + " ");
        //     }
        //     System.out.println();
        // }
        
        // Column wise printing / Transpose 
        // for(int c = 0; c < m; c++) {
        //     for(int r = 0; r < n; r++) {
        //         System.out.print(a[r][c] + " ");
        //     }
        //     System.out.println();
        // }
        
        // Find sum of each row of the matrix 
        // Find count of even numbers in each row of matrix 
        // Find the index of the column having the largest sum 
        
        // Print the index of the row having the largest sum 
        
        // int a[][] = {{1, 2, 3},
        //              {3, 4, 4},
        //              {3, 5, 7},
        //              {4, 6, 8}
        //             };
        
        // int n = a.length; // 4 
        // int m = a[0].length; // 3 
        
        // int mx = Integer.MIN_VALUE;
        // int mxi = -1;
        
        // for(int r = 0; r < n; r++) {
        //     int sum = 0;
        //     for(int c = 0; c < m; c++) {
        //         sum = sum + a[r][c];
        //     }
        //     if(sum > mx) {
        //         mx = sum;
        //         mxi = r;
        //     }
        // }
        
        // System.out.println(mx + " " + mxi);
        
        // Diagonals 

        //  00  01  02  03  i-j =-3  elm-> 03
        //  10  11  12  13  i-j =-2  elm-> 13 02
        //  20  21  22  23  i-j =-1  elm-> 23 12 01
        //  30  31  32  33  i-j = 0  elm-> 33 22 11 00
        //  40  41  42  43  i-j = 1  elm-> 43 32 21 10
        //
        // i-j = 4  elm-> 40
        // i-j = 3  elm-> 30 41 
        // i-j = 2  elm-> 20 31 42
        
        // int a[][] = {{1, 2, 3},
        //              {3, 4, 4},
        //              {3, 5, 7}
        //             };
                    
        // System.out.println(a);
        // System.out.println(a[0]);
        
        // a[1][2] = 10;
        
        // int n = a.length; // 4 
        // int m = a[0].length; // 3 
        
        // for(int i = 0; i < n; i++) {
        //     for(int j = 0; j < m; j++) {
        //         if(i == j) {
        //             System.out.println(a[i][j]);
        //         }
        //     }
        // }
        
        // for(int i = 0; i < n; i++) {
        //     for(int j = 0; j < m; j++) {
        //         if(i+j == n-1) {
        //             System.out.println(a[i][j]);
        //         }
        //     }
        // }
        
        // int a[][] = {{1, 2, 3},
        //              {3, 4, 4},
        //              {3, 5, 7}
        //             };
        
        // int n = a.length;
        // int m = a[0].length;
        
        // // First row 
        // for(int i = 0; i < m; i++) {
        //     System.out.println(a[0][i]);
        // }
        
        // // Last row 
        // for(int i = 0; i < m; i++) {
        //     System.out.println(a[n-1][i]);
        // }
        
        // int a = 5;
        
        // System.out.println(a++);
    }
}
