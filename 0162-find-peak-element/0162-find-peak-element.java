class Solution {
    public int findPeakElement(int[] nums) {
        int max = nums[0];
        int n = nums.length;
        int idx =0 ;
        for(int i = 0 ; i < n ; i++)
        {
            if(max < nums[i])
            {
                 max = nums[i];
                 idx = i ;
            }
        }
        return idx;
    }
}