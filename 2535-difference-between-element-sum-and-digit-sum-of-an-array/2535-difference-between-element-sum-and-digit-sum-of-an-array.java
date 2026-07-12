class Solution {
    static int digitSum(int n){
   int r=0,s=0;  
   while(n>0)
   {
    r=n%10;
    s=s+r;
     n=n/10;
   }
   return s;
    }
    public int differenceOfSum(int[] nums) {
        int n = nums.length;
        int  s =0 , s1 =0;
         for(int i = 0 ; i < n ; i++)
        {
           s += nums[i];
            s1 += digitSum(nums[i]);
        }
        return Math.abs(s - s1);
    }
}