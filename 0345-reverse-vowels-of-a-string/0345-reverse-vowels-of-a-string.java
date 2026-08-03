class Solution {
    public static void swap(char[] arr , int a , int b)
    {
        char temp = arr[a];
        arr[a]  =  arr[b];
        arr[b]  = temp;
    }
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int n = s.length();
        int i = 0 , j = n-1;
        String vowels = "aeiouAEIOU";
        while(i < j)
        {
           char  ch1 = arr[i];
            char ch2 = arr[j];
          
           if(vowels.indexOf(ch1) != -1 && vowels.indexOf(ch2) != -1)
           {
                swap( arr , i , j);
                i++;
                j--;              
           }
           else if(vowels.indexOf(ch1) != -1 && vowels.indexOf(ch2) == -1){
            j--;
            
           }
           else if(vowels.indexOf(ch1) == -1 && vowels.indexOf(ch2) != -1)
           {
             i++;
            
           }
           else
           {
            i++;
            j--;
           }
        }
        return new String(arr);
    }
}