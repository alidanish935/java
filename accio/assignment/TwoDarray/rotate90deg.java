package accio.assignment.TwoDarray;

public class rotate90deg {
    public static void main(String[] args) {
        // link ->  https://course.acciojob.com/idle?question=dddfc300-2739-4bd4-bf5e-c4e8a24f73d8
        int mat[][]={{1, 2},   //output   2 1
                    {2, 3}} ;       //    3 2
        int n = mat.length;
        int l=0;
        for(int i=0;i<n;i++){
            int k=n-1;
            for(int j=0;j<n;j++){
                System.out.print(mat[k][l]+" ");//  00  01    10 00
                  k--;                          //  10  11    11 01
            }
            l++;
            System.out.println();
        }
    }
}
