class Solution {
    static int isEvenSum(int n)
{
        int r=0,s=0;
        while(n>0)
    {
        r=n%10;
        s=s+r;
        n=n/10;
    }
    return s;
}
    public int countEven(int num) {
        int cnt = 0;
        for(int i = 1 ; i <= num ; i++)
        {
            if(isEvenSum(i)%2 == 0)
            {
                cnt++;
            }
        }
        return cnt;
    }
}