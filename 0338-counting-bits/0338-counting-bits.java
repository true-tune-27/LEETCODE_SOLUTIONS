class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n+1];
        Arrays.fill(arr,0);
        for(int i = 1 ; i < n+1 ; i++)
        {
            arr[i] = arr[i& (i-1)]+1;
        }
        return arr;
    }
}