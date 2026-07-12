class Solution {
    public int prefixCount(String[] words, String pref) {
        int cnt =0 ;
        for(String eachWord : words)
        {
            if(eachWord.startsWith(pref))
            {
                cnt++;
            }
        }
        return cnt;
    }
}