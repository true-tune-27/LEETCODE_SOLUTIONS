class Solution {
public:
    int sumDivisibleByK(vector<int>& nums, int k) {
        map<int,int>freq;
        for(int num : nums)
        {
            freq[num]++;
        }
        int sum =0;
        for(auto[key,value]: freq)
            {
                if(value % k == 0)
                {
                    sum += key*value;
                }
            }
        return sum;
    }
};