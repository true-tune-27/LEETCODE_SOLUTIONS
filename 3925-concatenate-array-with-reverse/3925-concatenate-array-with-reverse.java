class Solution {
    public int[] concatWithReverse(int[] nums) {
        int[] res = new int[2*nums.length];
        int n = nums.length;
        ArrayList<Integer>arr = new ArrayList<>();
        Arrays.fill(res , 0);
        for(int i = 0 ; i < n ; i++)
        {
            arr.add(nums[i]);
        }
        for(int i = n-1 ; i >= 0 ; i--)
        {
            arr.add(nums[i]);
        }
        for(int i = 0 ; i < 2*n ; i++)
        {
            res[i] = arr.get(i);
        }
        return res;
    }
}