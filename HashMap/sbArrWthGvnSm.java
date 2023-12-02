package HashMap;

import java.util.HashMap;
import java.util.Map;

public class sbArrWthGvnSm {
    public static void main(String[] args){
        int arr[]={1,4,20,3,10,5};
        int n = arr.length;
        int sum = 33;

        int start = 0, end = -1, curr_sum = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++){
            curr_sum = curr_sum+arr[i];
            if(curr_sum == sum){
                end =i;
                break;
            }
            if(hm.containsKey(curr_sum-sum)){
                start = hm.get(curr_sum - sum)+1;
                end = i;
            }
            hm.put(curr_sum, i);
        }
        // for(Map.Entry<Integer,Integer>e:hm.entrySet()){
        //     System.out.println(e.getKey()+" --> "+e.getValue());
        // }

        if(end == -1){
            System.out.println("No sub arr found");
        }else{
            System.out.println("sub arr found from index "+start +" till "+end);

        }
    }
}
