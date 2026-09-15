class Solution {
    public int findSpecialInteger(int[] arr) {
        int n = arr.length;
        int cnt  = n /4;
        int res = 0;

        HashMap<Integer , Integer>freq = new HashMap<>();
        for(int num : arr)
        {
            freq.put(num , freq.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer, Integer> entry : freq.entrySet())
        {
            if(entry.getValue() > cnt)
            {
                res = entry.getKey();
            }
        }
        return res;
    }
}