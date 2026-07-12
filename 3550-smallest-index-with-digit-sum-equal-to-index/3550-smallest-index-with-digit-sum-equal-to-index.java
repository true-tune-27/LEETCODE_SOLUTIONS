class Solution {
    static int issum(int n){
        int r = 0 ,s = 0;
        while(n != 0)
        {
            r = n %10;
            s+= r;
            n = n/10;
        }
        return s;
    }
    public int smallestIndex(int[] nums) {
        int k = -1;
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(issum(nums[i]) == i)
            {
                 k = i;
                 break;
            }
        }
        return k;
    }
}