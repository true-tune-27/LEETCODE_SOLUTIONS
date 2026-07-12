class Solution {
    public int findNonMinOrMax(int[] nums) {
        int n = nums.length;
        int min_ele = nums[0];
        int max_ele = nums[0];
        for(int i =0 ; i < n ; i++)
        {
            if(min_ele > nums[i]) min_ele = nums[i];
            if(max_ele < nums[i]) max_ele = nums[i];
        }
        Arrays.sort(nums);
        int cnt = 0 ;
        for(int i = 0 ; i < n ; i++)
        {
            if(nums[i] == min_ele ||  nums[i] == max_ele )
            {
                cnt++;
            }
        }
        if(cnt == 2 && n == 2|| cnt == 1 && n == 1) return -1;
        else return nums[n-2];
        
    }
}