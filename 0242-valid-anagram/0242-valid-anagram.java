class Solution {
    public boolean isAnagram(String s, String t) {
        char[] charArray = s.toCharArray();
        char[] charArray1 = t.toCharArray();
        Arrays.sort(charArray);
        Arrays.sort(charArray1);
        boolean bool = Arrays.equals(charArray,charArray1);
        return bool;


        
    }
}