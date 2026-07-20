class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>>list = new ArrayList<>();
        int m = grid.length;
        int n = grid[0].length;
        ArrayList<Integer>arr = new ArrayList<>();
        for(int i = 0 ; i < m ; i++)
        {
            for(int j = 0 ; j < n ; j++)
            {
                arr.add(grid[i][j]);
            }
        }
        k = k % arr.size();
        List<Integer>arr2 = new ArrayList<>();
        for(int i = arr.size() -k ; i < arr.size() ; i++)
        {
            arr2.add(arr.get(i));
        }
        for(int i = 0 ; i < arr.size() - k ; i++)
        {
            arr2.add(arr.get(i));
        }
        int idx =0;
        int[][] mat = new int[m][n];
        for(int i = 0 ; i < m ; i++)
        {
            for(int j = 0; j < n ; j++)
            {
                mat[i][j] = arr2.get(idx++);
            }
        }
        for (int i = 0; i < mat.length; i++) {
    List<Integer> row = new ArrayList<>();
    for (int j = 0; j < mat[0].length; j++) {
        row.add(mat[i][j]);
    }
    list.add(row);
}
return list;
    }
}