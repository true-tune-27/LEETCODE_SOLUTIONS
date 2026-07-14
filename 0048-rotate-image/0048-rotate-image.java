class Solution {
    public void rotate(int[][] matrix) {
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
        for(int i = 0 ; i < m ; i++)
        {
            for(int j = 0 ; j < m ;j++)
            {
                System.out.println(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}