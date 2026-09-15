class Solution {
    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int sum = 0;
        int last = nums.length -1 ;
        while(k --> 0)
        {
            int a = nums[last];
            sum += a;
            nums[last] = a+1;

        }
        return sum;
    }
}