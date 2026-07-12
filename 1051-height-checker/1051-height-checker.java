class Solution {
    public int heightChecker(int[] heights) {
        int[] sortedheights = Arrays.copyOf(heights,heights.length);
         Arrays.sort(sortedheights);
        int mismatch = 0;
        for(int i = 0 ; i < heights.length ;i++)
        {
            if(heights[i] != sortedheights[i])
            {
                mismatch++;
            }
        }
        return mismatch;
    }
}