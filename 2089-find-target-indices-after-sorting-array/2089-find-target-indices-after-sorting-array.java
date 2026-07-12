class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> myList =  new ArrayList<>();
        //int[] arr = new int[nums.length];
        //int[] arr = nums.clone();
        Arrays.sort(nums);
        for(int i =0 ; i < nums.length ; i++)
        {
            if(target == nums[i])
            {
                myList.add(i);
            }
        }
        return myList;

    }
}