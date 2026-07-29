class Solution {
    public int hammingWeight(int n) {
        String s = Integer.toBinaryString(n);
        char[] arr = s.toCharArray();
        int cnt = 0;
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i] == '1') cnt++;
        }
        return cnt;
    }
}