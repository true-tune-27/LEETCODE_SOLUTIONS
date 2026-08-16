class Solution {
    public int minOperations(String s) {
        int n = s.length();
        int res = Integer.MAX_VALUE;
        for(int r = 0 ; r < n ; r++)
            {
                int op = r;
                for(int i = 0 ; i <  n/2 ; i++)
                    {
                        int leftIdx = (i+r) % n;
                        int rightidx = (n-i-1+r) % n;
                        char left = s.charAt(leftIdx);
                        char right = s.charAt(rightidx);
                        int ltr = (right - left+26) % 26;
                        int rtl = (left-right +26) % 26;
                        op += Math.min(ltr,rtl);
                        
                    }
                res = Math.min(res , op);
            }
        return res;
    }
}