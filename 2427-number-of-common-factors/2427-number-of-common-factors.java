class Solution {
     static int commonFactors1(int a, int b)
    {
        int n;
        int fc =0 ;
        if(a > b) 
        {
           n = a ;
        }
        else
        {
            n = b;
        }
           for(int i = 1 ; i <= n ; i++)
        {
            if(a % i == 0 && b % i == 0) fc++;
        }
        return fc;
    }
    public int commonFactors(int a, int b) {
          int k = commonFactors1(a,b);
          return k;
    }
}