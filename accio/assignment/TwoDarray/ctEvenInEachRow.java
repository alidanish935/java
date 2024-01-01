package accio.assignment.TwoDarray;

public class ctEvenInEachRow {
    public static void main(String[] args) {
        // its not the part of assignment
         int a[][] = {{1, 2, 3},
                     {3, 4, 4},
                     {3, 5, 7},
                     {4, 6, 8}
                    };
        int n = a.length;int m =a[0].length;
        for(int i=0;i<n;i++){
            int ct=0;
            for(int j=0;j<m;j++){
                if(a[i][j]%2==0){
                    ct++;
                }
            }
            System.out.println(ct);
        }
        
    }
}
