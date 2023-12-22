package accio.assignment.pattern;

public class pyramid {
    public static void main(String[] args) {
    //     *          3
    //   * * *        2
//     * * * * *      1
//   * * * * * * *
        // for(int i=1;i<=4;i++){
        //     for(int k=1;k<=4-i;k++){
        //         System.out.print("  ");
        //     }
        //     // System.out.println();
        //     for(int j=1;j<=2*i-1;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        //     * * * * *      0
        //       * * *        1
        //         *          2

        // int a =5;
        // for(int i=1;i<=3;i++){
        //     for(int j=1;j<=i-1;j++){
        //         System.out.print("  ");
        //     }
        //     for(int j=1;j<=a;j++){
        //         System.out.print("* ");
        //     }
        //     a=a-2;
        //     System.out.println();
        // }  
        
    //     *          3
    //   * * *        2
//     * * * * *      1
//   * * * * * * *
//     * * * * *      0
//       * * *        1
//         *          2
            // for(int i=1;i<=4;i++){
            //     for(int j=1;j<=4-i;j++){
            //         System.out.print("  ");
            //     }
            //     for(int j=1;j<=2*i-1;j++){
            //         System.out.print("* ");
            //     }
            //     System.out.println();
            // }
            // int a=5;
            // for(int i=1;i<=3;i++){
            //     for(int j=1;j<=i-1;j++){
            //         System.out.print("  ");
            //     }
            //     for(int j=1;j<=a;j++){
            //         System.out.print("* ");
            //     }
            //     a=a-2;
            //     System.out.println();
            // }

                int n=5;
                int up = (n/2)+1;
             for(int i=1;i<=up;i++){
                for(int j=1;j<=up-i;j++){
                    System.out.print("  ");
                }
                for(int j=1;j<=2*i-1;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
            int d= n/2;
            int a=d+2;
            for(int i=1;i<=d;i++){
                for(int j=1;j<=i;j++){
                    System.out.print("  ");
                }
                for(int j=1;j<=a;j++){
                    System.out.print("* ");
                }
                a=a-2;
                System.out.println();
            }
    }
    
}
