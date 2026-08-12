class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] arr = new int[nums.length];
        Arrays.fill(arr,0);
        int positive = 0 , negative = 1;
        for(int num : nums)
        {
            if(num > 0)
            {
                arr[positive] = num;
                positive += 2;
            }
            else
            {
                arr[negative] = num;
                negative += 2;
            }

        }
        return arr;
    }
}