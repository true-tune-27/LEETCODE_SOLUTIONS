class Solution {
      public static int[][] rotate(int[][] matrix) {
        int m = matrix.length;
        int[][] res = new int[m][m];
        for(int i = 0 ; i < m ; i++)
        {
            for(int j = 0 ; j < m ;j++ )
            {
                res[i][j] = matrix[j][i];
            }
          
        }
        for(int i = 0 ; i < m ; i++)
        {
            int col = 0;
            for(int j = m-1 ; j >= 0 ; j--)
            {
                matrix[i][col++] = res[i][j];      
            }
        }
       return matrix;
    }

    public boolean isTrue(int[][] mat , int[][] target)
    {
        int n = mat.length;
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ; j < n ; j++)
            {
                if(mat[i][j] != target[i][j])
                {
                    return false;
                }
            }
        }
        
        return true;
    }
    public boolean findRotation(int[][] mat, int[][] target) {
        for(int  i = 0 ; i < 4 ; i++)
        {
            if(isTrue(mat,target))
            {
                return true;
            }
            mat = rotate(mat);
        }
        return false;
    }
}