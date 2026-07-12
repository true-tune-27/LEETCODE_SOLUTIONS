class Solution {
    static int sumofDigits(int n)
    {
        int r = 0 , s =0 ;
        while(n != 0)
        {
             r = n % 10;
             s += r;
             n = n /10;
        }
        return s;
    }
    public int minElement(int[] nums) {
        int[] output = new int[nums.length];        
        for(int i = 0 ; i < nums.length ; i++)
        {
            output[i] = sumofDigits(nums[i]);
        }
        Arrays.sort(output);        
        return output[0]; 
        
    }
}