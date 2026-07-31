class Solution {
    public int xorOperation(int n, int start) {
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = start + (2*i);
        }
        int xor_operation = start;
        for(int i =1 ; i < n ; i++)
        {
            xor_operation ^= arr[i];
        }
        return xor_operation;
    }
}