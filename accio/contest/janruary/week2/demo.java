package accio.contest.janruary.week2;
import java.util.*;

public class demo {
 
        static ArrayList<String> list;
     
        public static ArrayList<String> solve(int n, int m, int i, int j, String ans) {
            // Base case: reached bottom-right cell
            if (i == n && j == m) {
                list.add(ans);
                return list;
            }
     
            // Recursive calls for possible moves
            if (i < n) {
                solve(n, m, i + 1, j, ans + "v1");
                if (i + 2 <= n) {
                    solve(n, m, i + 2, j, ans + "v2");
                }
            }
     
            if (j < m) {
                solve(n, m, i, j + 1, ans + "h1");
                if (j + 2 <= m) {
                    solve(n, m, i, j + 2, ans + "h2");
                }
            }
     
            if (i < n && j < m) {
                solve(n, m, i + 1, j + 1, ans + "d1");
                if (i + 2 <= n && j + 2 <= m) {
                    solve(n, m, i + 2, j + 2, ans + "d2");
                }
            }
     
            return list;
        }
     
        public static ArrayList<String> allPossiblePaths(int n, int m) {
            list = new ArrayList<>();
            solve(n, m, 1, 1, ""); // Start from the top-left cell (1,1)
            return list;
        }
     
        public static void main(String args[]) {
            Scanner input = new Scanner(System.in);
            int n = input.nextInt();
            int m = input.nextInt();
            ArrayList<String> result = allPossiblePaths(n, m);
            Collections.sort(result);
            for (String str : result) {
                System.out.println(str);
            }
        }
    
}


// if(i==n&&j==m){
//     list.add(ans);
//     return;
// }
// if(i>n||j>m){
//     return ;
// }
//     solve(n,m,i+1,j,ans+"v1");
//     solve(n,m,i,j+1,ans+"h1");
//     solve(n,m,i+2,j,ans+"v2");
//     solve(n,m,i,j+2,ans+"h2");
//     solve(n,m,i+1,j+1,ans+"d1");
//     solve(n,m,i+2,j+2,ans+"d2");