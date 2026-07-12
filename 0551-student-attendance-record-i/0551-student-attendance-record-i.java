class Solution {
    public boolean checkRecord(String s) {
        char[] arr = s.toCharArray();
        int cnt1=0,cnt2=0,cnt3=0;
        for(int i = 0 ; i < arr.length ; i++)
        {
            char c = s.charAt(i);
            if(c == 'A')
            {
                cnt1++;
                if(cnt1 >= 2 ) return false;
            }
            if(c =='L')
            {
                cnt2++;
                if(cnt2 == 3) return  false;
            }
            else
            {
                cnt2 =0;
            }
        }
        return cnt1<2 && cnt2 < 3;
    }
}