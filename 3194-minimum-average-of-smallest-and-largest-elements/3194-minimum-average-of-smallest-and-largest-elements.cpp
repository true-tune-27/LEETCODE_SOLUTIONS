class Solution {
public:
    double minimumAverage(vector<int>& nums) {
        sort(nums.begin() , nums.end());
        int left = 0;
        int right = nums.size() - 1;
        double min_avg = 100000.00;
        while(left < right)
        {
            double curr_avg = (nums[left] + nums[right])/2.0;
            if(curr_avg < min_avg)
            {
                min_avg = curr_avg;
            }
            left++;
            right--;
        }
        return min_avg;
    }
};