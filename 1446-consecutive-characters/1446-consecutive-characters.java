class Solution {
    public int maxPower(String s) {
        char[] arr = s.toCharArray();
        int max = 0;
        int cnt = 0;
        for(int i = 0 ; i < arr.length-1 ; i++)
        {
            if(arr[i] == arr[i+1])
            {
                cnt++;
                max = Math.max(max , cnt);
            }
       
            else
            {
                cnt = 0;
            }
        }
        return max+1;
    }
}