class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        ArrayList<Integer> res = new ArrayList<>();
        int top = 0 , bottom = mat.length-1;
        int left = 0 , right = mat[0].length-1;
        while(top <= bottom && left <= right)
        {
            for(int i = left ; i <= right ; i++)
            {
                res.add(mat[top][i]); // left --> right
            }
            top++;
            for(int j = top ; j <=  bottom ; j++)
            {
                res.add(mat[j][right]); // top --> bottom
            }
            right--;
            if(top <= bottom)
            {
                for(int i = right ; i>= left ; i-- )
                {
                    res.add(mat[bottom][i]);
                }
                bottom--;
            }
               if(left <= right)
            {
                for(int j = bottom ; j>= top ; j-- )
                {
                    res.add(mat[j][left]);
                }
                left++;
            }

        }
        return res;
    }
}