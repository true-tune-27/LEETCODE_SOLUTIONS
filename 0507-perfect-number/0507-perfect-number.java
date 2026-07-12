class Solution {
     static int Factorsum(int n)
        {
            int sum  = 0 ;
            for(int i =1 ; i < n ; i ++)
            {
                if(n % i == 0)
                {
                    sum  += i ;
                }
            }
            return sum ;
        }
    public boolean checkPerfectNumber(int num) {
       int k = Factorsum(num);
       if(k == num) return true;
       else return false;
    }
}