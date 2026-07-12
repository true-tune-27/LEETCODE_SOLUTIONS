class Solution {
    public int countPairs(int[] nums, int k) {
        int n = nums.length;
        int r ;
        int cnt = 0 ;
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = i+1 ; j < n ; j++)
            {
                if(nums[i] == nums[j])
                {
                    r = i*j;
                    if(r % k == 0)
                    {
                        cnt++;
                    }
                }
 
            }
        }
        return cnt;
    }
}