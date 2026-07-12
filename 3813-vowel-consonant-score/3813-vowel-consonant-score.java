class Solution {
    public int vowelConsonantScore(String s) {
        char[] arr = s.toCharArray();
        int cnt = 0;
        int cnt2 = 0;
        for(char ch : s.toCharArray())
        {
            if(Character.isLetter(ch))
            {
                if(isVowel(ch))
            {
                cnt++;
            }
            else 
            {
                cnt2++;
            }

            }
        }
        {
            
        }
        if (cnt2 >  0) return  cnt / cnt2;
        else return 0;
      
    }
     
    public boolean isVowel(char ch)
    {
        return ch == 'a' ||ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u' ;
     }
}