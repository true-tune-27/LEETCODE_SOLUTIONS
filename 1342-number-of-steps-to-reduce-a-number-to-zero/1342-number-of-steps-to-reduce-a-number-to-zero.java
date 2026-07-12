class Solution {
    public int numberOfSteps(int num) {
        int cnt1 = 0, cnt2 = 0;
        while(num != 0)
        {
            if(num% 2 == 0)
            {
                num = num /2;
            }
            else
            {
                num = num -1;                
            } 
            cnt1++;        

        }
          return cnt1;
    }
}