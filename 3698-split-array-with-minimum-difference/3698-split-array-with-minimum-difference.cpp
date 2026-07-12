class Solution {
public:
    long long splitArray(vector<int>& nums) {
         int n = nums.size();
    if (n < 2) {
        return -1;
    }

    vector<long long> prefix_sum(n, 0);
    prefix_sum[0] = nums[0];
    for (int i = 1; i < n; ++i) {
        prefix_sum[i] = prefix_sum[i - 1] + nums[i];
    }

    vector<bool> is_increasing(n, false);
    is_increasing[0] = true;
    for (int i = 1; i < n; ++i) {
        if (nums[i] > nums[i - 1]) {
            is_increasing[i] = is_increasing[i - 1];
        }
    }

    vector<bool> is_decreasing(n, false);
    is_decreasing[n - 1] = true;
    for (int i = n - 2; i >= 0; --i) {
        if (nums[i] > nums[i + 1]) {
            is_decreasing[i] = is_decreasing[i + 1];
        }
    }

    long long min_diff = LLONG_MAX;
    bool found_valid_split = false;

    for (int i = 0; i < n - 1; ++i) {
        if (is_increasing[i] && is_decreasing[i + 1]) {
            found_valid_split = true;
            long long left_sum = prefix_sum[i];
            long long right_sum = prefix_sum[n - 1] - prefix_sum[i];
            min_diff = min(min_diff, abs(left_sum - right_sum));
        }
    }

    if (found_valid_split) {
        return min_diff;
    } else {
        return -1;
    }
    }
};