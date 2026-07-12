class Solution {
    public int[] sortArray(int[] nums) {
        int n = nums.length;
        int[] output = new int[n];
        output = nums.clone();
        Arrays.sort(output);
        return output;
        
    }
}