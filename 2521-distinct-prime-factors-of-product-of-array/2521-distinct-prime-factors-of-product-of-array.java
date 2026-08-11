class Solution {
        public static void sieve(boolean[] isPrime) {
        int n = isPrime.length;
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for (int p = 2; p * p < n; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i < n; i += p) {
                    isPrime[i] = false;
                }
            }
        }
    }

    public int distinctPrimeFactors(int[] nums) {
        HashSet<Integer>factors = new HashSet<>();
        boolean[] isPrime = new boolean[10001];

        sieve(isPrime);
        for(int num : nums)
        {
            for(int j = 2 ; j <= num ; j++)
            {
                if(isPrime[j])
                {
                    if(num % j == 0)
                    {
                        factors.add(j);
                    }
                }
                while(num % j == 0)
                {
                    num = num / j;
                }
            }
        }
        return factors.size();
    }
}