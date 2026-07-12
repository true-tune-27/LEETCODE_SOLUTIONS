class Solution {
public:
    int majorityElement(vector<int>& nums) {
        map<int,int>freq;
        int k = nums.size();
        for(auto num : nums)
        {
            freq[num]++;
        }
       int l = 0;
        for(auto [key,value]: freq)
        {
            if(value > k/2)
            {
                l = key;
                break;
            }

        }
        return l;
    
    }
};