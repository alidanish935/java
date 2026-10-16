import java.util.HashMap;

public class Practice {
    public static void main(String[] args) {
        String s = "Danish";
        HashMap<Character,Integer>hm = new HashMap<>();
        boolean found = false;
        for(char ch : s.toCharArray()){
            hm.put(ch, hm.getOrDefault(ch, 0)+1);
            if(hm.get(ch)>1) found = true;
        }
        if(found){
            System.out.println("@");
        }else{
            System.out.println(s);
        }
    }
}
