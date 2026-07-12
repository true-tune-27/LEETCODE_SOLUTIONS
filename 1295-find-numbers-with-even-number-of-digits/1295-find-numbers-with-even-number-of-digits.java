class Solution {
    public int findNumbers(int[] nums) {
        int cnt = 0;
        for(int eachvalue:nums)
        {
            if(Integer.toString(eachvalue).length() % 2 == 0)// Integer.toString --> converts
            // integer to string and we have got the length of the string by using .length
            //and time complexity is 2ms.
            {
                cnt++;
            }
        }
        return cnt;
        
    }
}