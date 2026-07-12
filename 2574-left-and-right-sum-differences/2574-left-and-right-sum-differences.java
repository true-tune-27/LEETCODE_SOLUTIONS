class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] arr1 = new int[nums.length];
        int[] arr2 = new int[nums.length];
        int[] arr3 = new int[nums.length];
         int n = nums.length;
        Arrays.fill(arr1,0);
        Arrays.fill(arr2,0);
        int sum = 0;
        int sum2 = 0;
        for(int i = 0 ; i <n-1 ; i++)
        {
            sum+= nums[i];
            arr1[i+1] = sum;

        }
        for(int j = n-1 ; j >=1 ; j--)
        {
            sum2 += nums[j];
            arr2[j-1] = sum2;
        }
        for(int i = 0 ; i < n ; i++)
        {
            arr3[i] =  Math.abs(arr1[i]-arr2[i]);
        }
        return arr3;
    }
}