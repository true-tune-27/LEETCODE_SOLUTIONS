class Solution {
    public int numSteps(String s) {       
       int bit = 0;
       int c = 0;
       for(int i = s.length()-1 ; i > 0 ; i--)
       {
        int n = s.charAt(i) -'0';
        if(n+c == 1)
       {
        bit += 2;
        c = 1;
       }
       else
       {
        bit += 1;
       }
       }
       return bit+c;

    }

}