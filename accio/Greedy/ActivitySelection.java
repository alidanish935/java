package accio.Greedy;
 
import java.util.ArrayList;

public class ActivitySelection {
    public static void main(String[] args) {
        int start[]={1,3,0,5,8,5};
        int end[]  ={2,4,6,7,9,9};

        int n =start.length; 
        // if we need to count only maximum activites performed
        int ct =1;
        int endAct = end[0];

        for(int i=1;i<n;i++){
            if(start[i]>=endAct){
                ct++;endAct = end[i];
            }
        }
        System.out.println(ct);


    // now if we need to find ct &  starting day and end day of activity 
        // int maxAct =0;
        // ArrayList<Integer> ans = new ArrayList<>();

        // maxAct =1;
        // ans.add(0);
        // int lastEnd =end[0];
        // for(int i=1;i<end.length;i++){
        //     if(start[i]>=lastEnd){
        //         maxAct++;
        //         ans.add(i);
        //         lastEnd = end[i];
        //     }
        // }
        // System.out.println("max Act-> "+maxAct);
        // System.out.println("Selected Activities "+ans);
    }
}
