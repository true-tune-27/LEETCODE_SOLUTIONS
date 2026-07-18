class Solution {
    public int gcd(int a , int b)
    {
        if(b==0) return a;
        else return gcd(b , a % b);
    }
    public int findGCD(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int res =0 ;
        for(int i = 0 ; i < n ; i++)
        {
            res = gcd(nums[0] , nums[n-1]);        
        }
        return res;
    
    }
}