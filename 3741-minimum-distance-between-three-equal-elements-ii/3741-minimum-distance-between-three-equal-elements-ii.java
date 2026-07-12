class Solution {
    public int minimumDistance(int[] nums) {
        Map<Integer,List<Integer>>indexMap = new HashMap<>();
        int min_dis = Integer.MAX_VALUE;
        for(int i = 0 ; i < nums.length ; i++)
            {
                int num = nums[i];
                List<Integer>IND = indexMap.getOrDefault(num, new ArrayList<>());
                IND.add(i);
                indexMap.put(num,IND);
                int size = IND.size();
                if(size >=3 )
                {
                    int min_indx = IND.get(size - 3);
                    int max_indx = IND.get(size - 1);
                    int spans = max_indx - min_indx;
                    int curr_dis = 2 * spans;
                     min_dis = Math.min(min_dis,curr_dis);
                }
            }
        if(min_dis == Integer.MAX_VALUE)
        {
            return -1;
        }
        else
        {
            return min_dis;
        }
        
    }
}