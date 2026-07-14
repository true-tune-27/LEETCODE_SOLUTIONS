class Solution {
    private static int dfs(int[][] grid , int i , int j)
    {
        int m = grid.length;
        int n = grid[0].length;
        if(i == m) return j;

        if(grid[i][j] == 1 &&(j+1 < n) && grid[i][j+1] == 1)
        {
            return dfs(grid , i+1 , j+1);
        }
        if(grid[i][j] == -1 && (j-1 >= 0) && grid[i][j-1] == -1)
        {
            return dfs(grid , i+1 , j-1);
        }
        return -1;
    }
    public int[] findBall(int[][] grid) {
        int[] ans = new int[grid[0].length];
        for(int i = 0 ; i < ans.length ; i++)
        {
            ans[i] = dfs(grid , 0 , i);
        }
        return ans;
    }
}