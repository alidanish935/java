package accio.assignment.graph;

// public class noOfIsland {
    
// }


import java.util.*;
import java.lang.*;
import java.io.*;

class Solution{
    static int dir[][]={{-1,0},{0,-1},{0,1},{1,0}};
    // static int dir[][]={{-1,0},{0,-1},{1,0},{0,1}};
    static int numberOfIslands(int[][] grid, int n, int m){
        //Write your code here
        int ct =0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    dfs(i,j,grid);
                    ct++;
                }
            }
        }
        return ct;
    }
    static void dfs(int r,int c,int[][] grid){//0 0
        if(r<0 || c<0 || r>=grid.length || c>=grid[0].length){
            return;
        }
        if(grid[r][c]!=1)return;
        grid[r][c]=2;
        for(int d=0;d<dir.length;d++){
            int darr[]=dir[d];//0 1
            int nr = r+darr[0];//0
            int nc = c+darr[1];//1
            dfs(nr,nc,grid);
        }
    }
}

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 
		int m = 2;
        int n = 4;
    	int M[][] = {{1,1,1,0},
                     {1,1,0,1}};
		
		System.out.println(Solution.numberOfIslands(M, m, n));
	}
}