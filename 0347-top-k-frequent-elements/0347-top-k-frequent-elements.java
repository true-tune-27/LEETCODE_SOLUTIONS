class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        ArrayList l1 = new ArrayList<>();
        HashMap<Integer,Integer>freq = new HashMap<>();
        for(int num : nums)
        {
            freq.put(num ,freq.getOrDefault(num , 0) +  1);
        }
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(freq.entrySet());
         //List<Integer> list = new ArrayList<>(freq.values());
        Collections.sort(list, (a, b) -> b.getValue() - a.getValue());
        int[] arr = new int[k];
        for(int i = 0 ; i < k ; i++)
        {
            arr[i] =(int) list.get(i).getKey();
        }
        return arr;

    }
}