package accio.assignment.TwoDarray;

public class colLarSum {
    public static void main(String[] args) {
         int a[][] = {{1, 2, 3},
                     {3, 4, 4},
                     {3, 5, 7},
                     {4, 6, 8}
                    };
        int n =a.length;int m = a[0].length;
        int mx = Integer.MIN_VALUE;int idx = -1;

        for(int j=0;j<m;j++){
            int sum =0;
            for(int i=0;i<n;i++){
                sum=sum+a[i][j];
                if(sum>mx){
                    mx=sum;
                    idx = j;
                }
            }
        }
        System.out.println(mx);
        System.out.println(idx);
        
    }
}
