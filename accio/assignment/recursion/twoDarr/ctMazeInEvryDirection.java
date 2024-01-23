package accio.assignment.recursion.twoDarr;

public class ctMazeInEvryDirection {
    public static void main(String[] args) {
        // https://course.acciojob.com/idle?question=2875c8b1-6a6b-4946-9aed-ce1ac886f2e0


    }
    // static int countAllPath(int i, int j, int n, int m, boolean vis[][])
    // {

    //     if(i == n && j == m) {
    //         return 1;
    //     }

    //     int ans = 0;

    //     for(int k = 0; k < 8; k++) {
            
    //         int newI = i + iDir[k];
    //         int newJ = j + jDir[k];
    //         if(isSafe(newI, newJ, n, m) && !vis[newI][newJ]) {
    //             vis[newI][newJ] = true;
    //             ans += countAllPath(newI, newJ, n, m, vis);
    //             vis[newI][newJ] = false;
    //         }
                  
    //     }

    //     return ans;
    // }
    
    // static int vis[][] = new int[20][20];
    // static int pr[] = {-1, -1, -1,  0,  1, 1, 1, 0};
    // static int pc[] = { 1,  0, -1, -1, -1, 0, 1, 1};
    
    // static int solve(int i, int j, int n, int m) {
    //     if(i == n && j == m) {
    //         return 1;
    //     }
    //     if(i > n || j > m || i <= 0 || j <= 0 || vis[i][j] == 1) {
    //         return 0;
    //     }

    //     vis[i][j] = 1;
    //     int ans = 0;

    //     for(int k = 0; k < 8; k++) {
    //         int x = i + pr[k];
    //         int y = j + pc[k];
    //         ans = ans + solve(x, y, n, m);
    //     }

    //     vis[i][j] = 0;
    //     return ans;
    // }
}
