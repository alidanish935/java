package subArr;

public class allSubArr {
    public static void main(String[] args) {
         int a[] = {3, 5, 2, 1, 6, 4};
        int n = a.length;

        for(int st=0;st<n;st++){
            for(int ed = st;ed<n;ed++){
                System.out.print(st+""+ed);
            }
            System.out.println();
        }
        
        // for(int st = 0; st < n; st++) {
        //     for(int ed = st; ed < n; ed++) {
                
        //         for(int i = st; i <= ed; i++) {
        //             System.out.print(a[i] + " ");
        //         }
        //         System.out.println();
                
        //     }
        // }
    }
}
