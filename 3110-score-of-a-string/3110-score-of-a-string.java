class Solution {
    public int scoreOfString(String s) {
        int n = s.length();
        int sum =0 ;        
        for(int i = 0 ; i < n-1 ; i ++)
        {        
          
           
               int k = (int)s.charAt(i);
               int l = (int)s.charAt(i+1);
               sum += Math.abs(k-l);
        }
       return sum;
       
        
    }
}