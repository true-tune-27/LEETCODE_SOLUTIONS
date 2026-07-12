class Solution {
    static int findGCD(int a, int b) {
        if (a == 0)
            return b;
        return findGCD(b % a, a);
    }
    public int findGCD(int[] nums) {
        int n = nums.length;
        int min_ele = nums[0];
        int max_ele = nums[0];
        for(int i = 0 ; i < n ; i++)
        {
            if(min_ele > nums[i])
            {
                min_ele = nums[i];
            }
              if(max_ele < nums[i])
            {
                max_ele = nums[i];
            }
        }
        int l = findGCD(min_ele, max_ele);
        return l;

        
    }
}