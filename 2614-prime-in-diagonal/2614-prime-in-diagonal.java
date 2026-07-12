class Solution {
    static boolean Isprime(int n)
    {
        if (n == 0 || n == 1) return false;
        int m = (int)Math.sqrt(n);
        
        for(int i =2; i <= m; i++ ){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    public int diagonalPrime(int[][] nums) {
        int max = 0;
        for(int i = 0 ; i < nums.length ; i++)
        {
            int j = i;
                    if(Isprime(nums[i][j]) == true)
                    {
                      if (max < nums[i][j]) max = nums[i][j];
                    }
        }
          for(int i = 0 ; i < nums.length ; i++)
        {
            int j = nums.length - 1 - i;
                    if(Isprime(nums[j][i]) == true)
                    {
                      if (max < nums[j][i]) max = nums[j][i];
                    }
        }

        return max;
        
    }
}