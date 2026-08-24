class Solution {

    boolean isPrime(int n) {
    if (n < 2)
        return false;

    for (int i = 2; i * i <= n; i++) {
        if (n % i == 0)
            return false;
    }

    return true;
}
    public int diagonalPrime(int[][] nums) {
        int max = 0;
        int m = nums.length;
        int n = nums[0].length;
       for(int i = 0 ; i < m ; i++)
       {
        for(int j = 0 ;  j < n ; j++)
        {
            if(i == j || i+j == m-1)
            {
                if(isPrime(nums[i][j]))
                {
                    max = Math.max(max , nums[i][j]);
                }
            }

        }
       }
       return max;
    }
}