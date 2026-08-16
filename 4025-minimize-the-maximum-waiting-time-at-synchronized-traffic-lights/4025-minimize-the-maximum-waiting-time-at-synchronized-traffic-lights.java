class Solution {
    public int minPenalty(int period, int[] lights, int[] arrivalTime) {
           //int[] arr = lights;
        int max_light = 0;
        for(int light : lights)
            {
                max_light = Math.max(max_light , light);
            }

        int ans = 0;
        for(int time : arrivalTime)
            {
                int r = time % period;
                int wait;
                if(r < max_light)
                {
                    wait = 0;
                }
                else
                {
                    wait = period -r;
                }
                ans = Math.max(ans , wait);
            }
        return ans;
    }
}