class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int cnt = 0;
        int l = 0 ;
        for(int r = 0 ; r < nums.length ; r++)
        {
            if(nums[r] == 0) 
            {
                l = 0;
                continue;
                
            }
            l++;
            max = Math.max(max, l);

        }
        return max;
    }
}