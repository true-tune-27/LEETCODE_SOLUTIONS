class Solution {
    public void rotate(int[] nums, int k)
   {
        int n = nums.length;
        int[] new_arr = new int[n];
        k = k % n;
       ArrayList<Integer>arr = new ArrayList<>();     
       if(n >= k)
    {
       for(int i = n-k; i < n ; i++)
       {
        arr.add(nums[i]);
       }
       for(int  j = 0 ; j < n-k ; j++)
       {
        arr.add(nums[j]);
       }
      
        for(int i = 0 ; i < n ; i++)
        {
            nums[i] = arr.get(i);
        }   
    }
           
  }
}