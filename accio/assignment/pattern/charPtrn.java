package accio.assignment.pattern;

public class charPtrn {
    public static void main(String[] args) {
        // A 
        // AB 
        // ABC 
        // ABCD 
        // ABCDE

        // for(int i=1;i<=5;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print((char)(j+64));
        //     }
        //     System.out.println();
        // }

        // but if we need to print for more then 26 char so we need to do J%26 to get in range of A-Z
        
        // for(int i=0;i<30;i++){
        //     for(int j=0;j<i;j++){
        //         System.out.print((char)(j%26+65));
        //     }
        //     System.out.println();
        // }


        // ABCDE 
        // ABCD 
        // ABC 
        // AB 
        // A 

        for(int i=1;i<=5;i++){
            for(int j=1;j<=5-i+1;j++){
                System.out.print((char)(j+64));
            }
            System.out.println();
        }

    }
}
