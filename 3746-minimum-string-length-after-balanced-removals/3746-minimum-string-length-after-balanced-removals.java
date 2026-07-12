class Solution {
    public int minLengthAfterRemovals(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        int cnt1 =0 , cnt2 =0;
        for(int i = 0; i < n ;i++)
            {
                if(arr[i] == 'a')
                {
                    cnt1++;
                }
                else
                {
                    cnt2++;
                }
                
            }
        if(cnt1 >= cnt2)
        {
            return cnt1 -cnt2;
        }
        else
        {
           return  cnt2 - cnt1;
        }

    }
}