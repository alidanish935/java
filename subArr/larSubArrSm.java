package subArr;

public class larSubArrSm {
    public static void main(String[] args) {
        int a[] = {3, -5, 2, 4, 6, 4};
        int n = a.length;

        int mx = Integer.MIN_VALUE;
        // for(int i=0;i<n;i++){
        //     int sm =0;
        //     for(int j=i;j<n;j++){
        //         sm +=a[j];
        //         if(sm>mx){
        //             mx=sm;
        //         }
        //     }
        // }
        // System.out.println(mx);

        // kaden's algorithm
            int sm=0;
        for(int i=0;i<n;i++){
            sm += a[i];
            if(sm>mx){
                mx=sm;
            }
            if(sm<0){
                sm=0;
            }
        }
        System.out.println(sm);
    }
}
