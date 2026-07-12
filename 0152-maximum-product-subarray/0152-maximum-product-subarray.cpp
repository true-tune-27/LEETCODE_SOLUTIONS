class Solution {
public:
    int maxProduct(vector<int>& nums) {
        int maxi = INT_MIN;
       // int max = INT_MIN;
        int curr_prod = 1;
        for(int i = 0 ; i < nums.size() ; i++)
        {
            curr_prod *= nums[i];

            /*if(curr_prod > max_pro)
            {
                max_pro = curr_prod;
            }*/
            maxi = max(curr_prod  , maxi);

            if(curr_prod == 0)
            {
                curr_prod = 1;
            }
           
        }
        curr_prod = 1;

        for(int i = nums.size() - 1 ; i >=  0 ; i--)
        {
            curr_prod *= nums[i];
            maxi = max(curr_prod , maxi);
             if(curr_prod == 0)
            {
                curr_prod = 1;
            }
        }
        return maxi;
    }
};