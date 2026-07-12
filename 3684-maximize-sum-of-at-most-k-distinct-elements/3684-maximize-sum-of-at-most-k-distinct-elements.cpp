class Solution {
public:
    vector<int> maxKDistinct(vector<int>& nums, int k) {
        vector<int> p_nums = nums;
        map<int,int> freq;
        for(int num : nums)
            {
                freq[num]++;
            }
        vector<int>distinct_numbers;
        for(auto &kv : freq)
            {
                distinct_numbers.push_back(kv.first);
            }
        sort(distinct_numbers.begin(),distinct_numbers.end(),greater<int>());
    if(distinct_numbers.size() > k)
       {
          distinct_numbers.resize(k);
       }
       return distinct_numbers;
    }
};