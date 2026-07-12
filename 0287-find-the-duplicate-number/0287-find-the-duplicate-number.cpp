class Solution {
public:
    int findDuplicate(vector<int>& nums) {
        map<int,int>freq;
        for(int num : nums)
        {
            freq[num]++;
        }
        int k =0;
        for(auto pair: freq)
        {
            if(pair.second >= 2)
            {
                k = pair.first;
            }
               
        }
        return k;
    }
};