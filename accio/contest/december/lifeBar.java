package accio.contest.december;

public class lifeBar {
    public static void main(String[] args) {// output -> 10
        // link  ->  https://course.acciojob.com/idle?question=66435173-41c3-4123-84f2-0a9bbec38f67
        String str = "abeabmabzabzabwabxabyabyabab"; int n = str.length();
        String maxSbstr = findMaxSbStr(str);
        System.out.println(maxSbstr);

    }

    private static String findMaxSbStr(String str) {
        int n = str.length();
        for(int i=0;i<n;i++){
            String sbStr = str.substring(0,i);
            if(str.endsWith(sbStr)){
                System.out.println(sbStr); 
                // return sbStr;
            }
        }
        return null;
    }
}
