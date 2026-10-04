class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int operations = 0;

        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] <= nums[i + 1]) {
                continue;
            }

            int current = nums[i];
            int next = nums[i + 1];
            int local_operations = 0;
            int divisor = greatestProperDivisor(current);

            if (divisor <= 1) {
                return -1;
            }

            local_operations++;
            nums[i] = divisor;
            if (nums[i] > next) {
                return -1;
            }
            operations += local_operations;
        }

        return operations;
    }

    private int greatestProperDivisor(int x) {
        if (x <= 1) {
            return 0;
        }
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                if (i < x) {
                    return i;
                }
                if (x / i < x) {
                    return x / i;
                }
            }
        }
        return 0;
    }
}