class Solution
 {
    static int[] digits(int num)
    {
      String temp = Integer.toString(num);
      int[] n = new int[temp.length()];
      for(int i = 0 ; i < temp.length() ; i++)
      {
         n[i] = temp.charAt(i) - '0';
      }
      return n;
    }
    public int countDigits(int num) {
     int[] n2 = digits(num);
     int cnt = 0;
     for(int i = 0 ; i < n2.length ; i++)
     {
        if(num % n2[i] == 0)
        {
            cnt++;
        }
     }
     return cnt;
        
    }
}