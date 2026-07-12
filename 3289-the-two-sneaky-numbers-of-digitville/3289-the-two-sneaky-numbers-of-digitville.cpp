class Solution {
public:
    vector<int> getSneakyNumbers(vector<int>& nums) {
        map<int,int>freq;
        for(auto num:nums)
        {
            freq[num]++;
        }
        vector<int>nums2;
    
        for(auto const& [element, frequency] : freq)
        {
           
           if(frequency == 2)
           {
              nums2.push_back(element);
           }            
        }
        return  nums2;
    }
};