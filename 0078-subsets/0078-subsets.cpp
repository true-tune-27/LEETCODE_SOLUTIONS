class Solution {
public:
    vector<vector<int>> subsets(vector<int>& nums) {
         int n = nums.size();
    vector<vector<int>> res;
    sort(nums.begin(), nums.end());
    // Loop through all possible 
    // subsets using bit manipulation
    for (int i = 0; i < (1 << n); i++) {
        vector<int> subset;

        // Loop through all elements 
        // of the input array
        for (int j = 0; j < n; j++) {

            // Check if the jth bit is 
            // set in the current subset
            if ((i & (1 << j)) != 0) {

                // If the jth bit is set, add 
                // the jth element to the subset
                subset.push_back(nums[j]);
            }
        }
        
        // Push the subset into result
        res.push_back(subset);
    }
    
    sort(res.begin(), res.end());
    return res;
    }
};