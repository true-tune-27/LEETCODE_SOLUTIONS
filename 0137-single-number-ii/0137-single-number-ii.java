class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer , Integer> mpp = new HashMap<>();
        for(int num : nums)
        {
           mpp.put(num, mpp.getOrDefault(num, 0) + 1);
        }
        int res = 0;
        for(Map.Entry<Integer ,Integer>entry : mpp.entrySet())
        {
            if(entry.getValue() == 1)
            {
                res = entry.getKey();
            }
        }
        return res ;
    }
}