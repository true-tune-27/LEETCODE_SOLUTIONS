class Solution {
public:
    vector<int> findMissingElements(vector<int>& nums) {
      unordered_set<int>pre_nums(nums.begin(),nums.end());
        int first_ele = *min_element(nums.begin(),nums.end());
        int last_ele = *max_element(nums.begin(),nums.end());
        vector<int>miss_numbers;
        for(int i = first_ele+1 ; i < last_ele ; i++)
            {
                if(pre_nums.find(i) == pre_nums.end())
                {
                    miss_numbers.push_back(i);
                }
            }
        return miss_numbers;
    }
};