package accio.leetcodeDailyChlng;

public class contSbArrPrdctLessK {
    public static void main(String[] args) {
        int nums[] ={10,9,10,4,3,8,3,3,6,2,10,10,9,3};int k=19;
        int n = nums.length;int ct=0;
    
        for(int i=0;i<n;i++){
            long prod =nums[i];
             if(prod<k)ct++;//1
           for(int j=i+1;j<n;j++){
            prod = prod*nums[j];//
            if(prod<k)ct++;//2
            else {
                break;
            }
           }
        }
        System.out.println(ct);
    }
}
