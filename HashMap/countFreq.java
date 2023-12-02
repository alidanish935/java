package HashMap;

import java.util.HashMap;
import java.util.Map;

public class countFreq {
    public static void main(String [] args){
        int arr[] = {1,2,3,4,5,2,2,3,4,4,5,1};
        int n =arr.length;

        HashMap<Integer,Integer>hm = new HashMap <>();
        for(int i=0;i<n;i++){
            if(hm.containsKey(arr[i])){
                int prevCount = hm.get(arr[i]);
                hm.put(arr[i],prevCount+1);
            }else{
                hm.put(arr[i],1);
            }
        }
        for(Map.Entry<Integer,Integer>e:hm.entrySet()){
            System.out.println(e.getKey()+" : "+e.getValue());
        }
    }
}
