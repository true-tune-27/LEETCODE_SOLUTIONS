class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        Arrays.fill(arr,0);
        
        for(int i = 0 ; i < n ; i++)
        {
            int cnt = 0;
            for(int j = 0 ; j < n ; j++)
            {
                if(nums[i] > nums[j])
                {
                    cnt++;
                }  
            }
            arr[i] = cnt;
            cnt = 0;
        }
        return arr;
    }
}