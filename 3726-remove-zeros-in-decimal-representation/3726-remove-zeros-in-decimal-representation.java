class Solution {
    public long removeZeros(long n) {
        long result = 0;
        long powerOf10 = 1;
        while(n > 0)
            {
                long digit = n %10;
                if(digit != 0)
                {
                result  += (digit*powerOf10);
                powerOf10 *= 10;
                }
                n = n/10;
            }
        return result;
    }
}