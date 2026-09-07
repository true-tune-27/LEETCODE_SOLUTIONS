class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int num : nums)
        {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : freq.entrySet())
        {
            int count = entry.getValue();
            if(count == 2)
            {
                ans.add(entry.getKey());
            }
        }
        return ans;

    }
}