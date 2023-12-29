package Array;

public class findLargArr {
    public static void main(String[] args) {
        int a[]={3, 2, 1};int b[]={1,2,3};
        int n = a.length,m=b.length,flag=0;
        if(n>m){
            flag =1;
        }else if(m>n){
            flag=2;
        }else{
            for(int i=0;i<n;i++){
                if(a[i]!=b[i]){
                    if(a[i]>b[i]){
                        flag=1;
                        break;
                    }else{
                        flag=2;
                        break;
                    }
                }
            }
        }
        System.out.println(flag);
       
    }
}
