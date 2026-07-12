class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] output = new int[n];
        for(int i = 0 ; i < n ; i ++)
        {
            output[i] = (nums[i]* nums[i]);
        }
        Arrays.sort(output);
        return output;
        
    }
}