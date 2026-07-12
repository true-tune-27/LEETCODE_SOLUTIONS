class Solution {
       public int subtractProductAndSum(int n) {
        
        int s=0,r=0,p=1;
         while(n>0)
        {
           r=n%10;
           s=s+r;
           p = p * r;
           n=n/10;
        }
        return p-s ;
    }
}