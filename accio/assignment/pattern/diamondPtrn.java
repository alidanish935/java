package accio.assignment.pattern;

public class diamondPtrn {
    // https://course.acciojob.com/idle?question=0de1afcc-ea73-4957-900a-da6db5fee0ed
     //    *        2
    //   * * *      1
    // * * * * *    0
    //   * * *
    //     *
    public static void main(String[] args) {
        int n=7;
        // int sp =n/2;
        // int st =(n/2)+1;
        // for(int i=1;i<=st;i++){
        //     for(int j=1;j<=n-2*1;j++){
        //         System.out.print(" ");
        //         sp--;
        //     }
    
        //     for(int j=1;j<=2*i-1;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        int sp =n/2,st=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=sp;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=st;j++){
                System.out.print("*");
            }
            System.out.println();
            if(i<=n/2){
                sp=sp-1;
                st=st+2;
            }else{
                sp=sp+1;
                st=st-2;
            }
        }

    }
}
    //     *          3
    //   * * *        2
//     * * * * *      1
//   * * * * * * *    0
//     * * * * *    0
    //   * * *
    //     *
