class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer , Integer> freq = new HashMap<>();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int num : nums)
        {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        for(Map.Entry<Integer , Integer> entry : freq.entrySet())
        {
            int count = entry.getValue();
            if(count > n/3)
            {
                arr.add(entry.getKey());
            }
        } 

        return arr;
    }
}