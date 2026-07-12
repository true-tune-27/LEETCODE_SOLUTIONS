class Solution {
    public long maxAlternatingSum(int[] nums) {
    long largerSum = 0; 
    long smallerSum = 0;
        int[] arr = new int[nums.length];
        for(int i = 0 ; i < nums.length ; i++)
            {
                arr[i] = Math.abs(nums[i]);
            }
        Arrays.sort(arr);
        int n = nums.length/2;
        for(int i = 0 ; i < n ; i++)
            {
                smallerSum += (arr[i]*arr[i]);
            }
        for(int j = n ; j < nums.length ; j++)
            {
                largerSum += (arr[j]*arr[j]);
            }
        return largerSum - smallerSum;
    }
}