class Solution {
public:
    long long maxProduct(vector<int>& nums) {
        vector<int> brave = nums;
        int n = brave.size();
        sort(brave.begin(), brave.end());
        long long min1 = brave[0];
        long long min2 = brave[1];
        long long max1 = brave[n-1];
        long long max2 = brave[n-2];

        long long K_MAX  = 100000;
        long long K_MIN = -100000;

        long long max_prod_two = max(min1*min2,max1*max2);
        long long cand1 = K_MAX * max_prod_two;

        long long min_prod_two = min1 * max1;
        long long cand2 = K_MIN * min_prod_two;

        return max(cand1,cand2);
        
    }
};