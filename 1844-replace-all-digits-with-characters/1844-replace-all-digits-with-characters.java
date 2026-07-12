class Solution {
    public String replaceDigits(String s) {
        int n = s.length();
        char[] output = new char[n];
        output = s.toCharArray();
        for(int  i = 0 ; i < n ; i++)
        {
            if(output[i] >= 48 && output[i] <= 57)
            {
                int digit = output[i] - 48; // Convert char digit to int
                output[i] = (char) (output[i - 1] + digit); 
            }
        }
        String s1 = new String(output);
        return s1;
        
    }
}