class Solution {
    static int  gcd(int num1 , int  num2)
    {
        if(num2 == 0)
        { 
            return num1;
        }
        return gcd(num2 , num1% num2);
    }
    public long gcdSum(int[] nums) {
        int n = nums.length;
       
        int[] arr = new int[nums.length];
         int max = nums[0];
        for(int i = 0 ; i < nums.length ; i++)
        {
           
            if(nums[i] > max)
            {
                max = nums[i];
            }
             arr[i] = gcd(nums[i] , max);
        }
        
        Arrays.sort(arr);
        long sum = 0;
        for(int i = 0 ; i < n ; i++)
        {           
            if(i == n /2) break;
            
           else  sum += gcd(arr[i] , arr[n-i-1]);
        }
        return sum;
        
    }
}