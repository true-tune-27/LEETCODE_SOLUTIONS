class Solution {
    public int numIdenticalPairs(int[] nums) {
         Map<Integer, Integer> freq = new HashMap<>();
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            int count = freq.getOrDefault(nums[i], 0);
            res += count;    
            freq.put(nums[i], count + 1);
        }
        return res;
    }
}