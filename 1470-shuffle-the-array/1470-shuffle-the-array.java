class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        int low = 0;
        int high = n;
        int index = 0;
        int index2 = 1;
        while (low < n && high < nums.length) {
            result[index] = nums[low];
            index += 2;
            result[index2] = nums[high];
            index2 += 2;
            low++;
            high++;
        }

        return result;
    }
}