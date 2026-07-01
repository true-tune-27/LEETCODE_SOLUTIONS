class Solution {
    public int removeElement(int[] nums, int val) {
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(nums[i] == val)
            {
                nums[i] = '_';
            }
        }
        Arrays.sort(nums);
        int cnt = 0;
        for(int  i = 0 ; i < nums.length ; i++)
        {
            if(nums[i] >= 0 && nums[i] <= 50)
            {
                cnt++;
            }
        }
        return cnt;
    }
}