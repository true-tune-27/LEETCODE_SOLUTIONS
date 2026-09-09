class Solution {
    public long countCommas(long n) {
        long ans = 0;

        // 1,000 to 999,999 -> 1 comma
        if (n >= 1000) {
            ans += Math.min(n, 999999L) - 1000L + 1;
        }

        // 1,000,000 to 999,999,999 -> 2 commas
        if (n >= 1000000) {
            ans += 2L * (Math.min(n, 999999999L) - 1000000L + 1);
        }

        // 1,000,000,000 to 999,999,999,999 -> 3 commas
        if (n >= 1000000000L) {
            ans += 3L * (Math.min(n, 999999999999L) - 1000000000L + 1);
        }

        // 1,000,000,000,000 to 999,999,999,999,999 -> 4 commas
        if (n >= 1000000000000L) {
            ans += 4L * (Math.min(n, 999999999999999L)
                         - 1000000000000L + 1);
        }

        // 1,000,000,000,000,000 onwards -> 5 commas
        if (n >= 1000000000000000L) {
            ans += 5L * (n - 1000000000000000L + 1);
        }

        return ans;
    }
}