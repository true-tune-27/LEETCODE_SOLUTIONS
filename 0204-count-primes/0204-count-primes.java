class Solution {
    static int build(int n)
    {
        int[] arr = new int[n+1];
        Arrays.fill(arr,0);
        for(int i = 2 ; i <= n ; i++)
        {
            for(int j = 2 ; j*i <= n ; j++)
            {
                arr[i*j] = 1;
            }
        }
        int cnt =0 ;
        for(int i = 2 ; i< n ;i++)
        {
            if(arr[i] == 0)
            {
                cnt++;
            }
        }
        return cnt;


    }
    public int countPrimes(int n) {
        return build(n);
    }
}