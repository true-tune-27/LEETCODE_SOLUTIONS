class Solution {
    public int  countCommas(int n) {
        int ans = 0;

        // 1,000 to 999,999 -> 1 comma each
        if (n >= 1000) {
            ans += Math.min(n, 999999) - 1000 + 1;
        }

        // 1,000,000 to 999,999,999 -> 2 commas each
        if (n >= 1000000) {
            ans += 2L * (Math.min(n, 999999999) - 1000000 + 1);
        }

        // 1,000,000,000 to n -> 3 commas each
        if (n >= 1000000000) {
            ans += 3L * (n - 1000000000L + 1);
        }

        return ans;
    }
}