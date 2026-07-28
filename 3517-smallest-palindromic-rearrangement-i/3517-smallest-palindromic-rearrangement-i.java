class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();
        
        String middleChar = (n & 1) == 1
        ? s.charAt(n / 2) + ""
        : "";
     StringBuilder  res = new StringBuilder();
  
     if(n == 1) return s;
     int[] freq = new int[26];
     char[] arr = s.toCharArray();
     for(char c : arr) freq[c - 'a']++;

     
     
     for(int i = 0 ; i  <  26 ; i++)
     {
        res.append(((char)(i+'a')+"").repeat(freq[i]/2));                       
     }
     return res.toString()+middleChar+res.reverse().toString();
    }
}