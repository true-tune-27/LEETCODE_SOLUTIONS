class Solution {
public:
    vector<int> findDisappearedNumbers(vector<int>& nums) {
        sort(nums.begin(), nums.end());
        map<int,int>freq;
        vector<int>miss;
        for(auto num : nums)
        {
            freq[num]++;
        }
        for(int i = 1 ; i <= nums.size() ; i++)

        {
            if(freq.find(i) == freq.end())
            {
                miss.push_back(i);
            }
        }
        return miss;
    }
};