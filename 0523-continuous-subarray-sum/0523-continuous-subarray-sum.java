class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // remainder 0 occurs before the array starts
        map.put(0, -1);

        int prefixSum = 0;

        for (int i = 0; i < nums.length; i++) {

            prefixSum += nums[i];

            int rem = prefixSum % k;

            // Handle negative remainders if needed
            if (rem < 0) {
                rem += k;
            }

            if (map.containsKey(rem)) {

                // Ensure subarray length is at least 2
                if (i - map.get(rem) > 1) {
                    return true;
                }

            } else {
                // Store only the first occurrence
                map.put(rem, i);
            }
        }

        return false;
    }
}