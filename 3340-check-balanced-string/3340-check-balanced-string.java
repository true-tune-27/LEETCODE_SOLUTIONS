class Solution {
    public boolean isBalanced(String num) {
        int n = num.length();
        int s1 = 0 , s2 = 0 ;
        char[]nums = num.toCharArray();
        for(int i = 0 ; i < n ; i ++)
        {
            if(i % 2 == 0)
            {
                s1 += nums[i]-'0';
            }
            else
            {
                s2 += nums[i]-'0';
            }
        }
        if(s1 == s2) return true ;
        else return false;
        
    }
}