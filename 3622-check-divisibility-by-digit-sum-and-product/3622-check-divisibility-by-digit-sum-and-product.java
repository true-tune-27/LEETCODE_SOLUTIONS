class Solution {
    public int productSum(int n)
    {
        int sum = 0;
        int product = 1;
        while(n > 0)
        {
            int digit  = n % 10;
            sum += digit;
            product = product * digit;
            n = n/10;
        }
        return sum+product;
    }


    public boolean checkDivisibility(int n) {
        return n % productSum(n) == 0  ;    
    }
}