class Solution {
public:
    int singleNonDuplicate(vector<int>& nums) {
        map<int,int>freq;
        int k = 0;
        for(int num : nums)
        {
            freq[num]++;
        }
        for(auto &pair :freq)
        {
            if(pair.second == 1)
            k = pair.first;
        }
        return k;
    }
};