class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        HashSet<Integer>set = new HashSet<>();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int n = nums.length;
        for(int num : nums)
        {
            min = Math.min(min , num);
            max = Math.max(max , num);
            set.add(num);
        }
        ArrayList<Integer>arr = new ArrayList<>();
        for(int i = min+1 ; i < max  ; i++)
        {
            if(!set.contains(i))
            {
                arr.add(i);
            }

        }
        return arr;
    }
}