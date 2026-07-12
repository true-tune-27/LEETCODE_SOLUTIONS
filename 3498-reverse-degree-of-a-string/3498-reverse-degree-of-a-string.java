class Solution {
    public int reverseDegree(String s) {
    char v = 'z';
      int res=0;

      for(int i=0;i<s.length();i++)
        {
            int ans = (int)v - (int)s.charAt(i) + 1;
            res=res+((i+1)*ans);
        }
        return res;
}
}