class Solution {
    public int minimumPushes(String word) {
        HashMap<Character, Integer>freq = new HashMap<>();
        char[] arr = word.toCharArray();
        for(char c : arr)
        {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        int keycount = freq.size();
        int sum1 = 0 , sum2 = 0 , sum3 = 0, sum4 = 0;
        List<Integer> list = new ArrayList<>(freq.values());
        Collections.sort(list, Collections.reverseOrder());
        
        for(int i = 0 ; i < Math.min(8,list.size()) ; i++)
        {
            sum1 += list.get(i)*1;
        }
        for(int i = 8 ; i < Math.min(16,list.size()); i++)
        {
            sum2 += list.get(i)*2;
        }
        for(int i = 16 ; i < Math.min(24,list.size()); i++)
        {
            sum3 += list.get(i)*3;
        }
         for(int i = 24 ; i < Math.min(26,list.size()); i++)
        {
            sum4 += list.get(i)*4;
        }
        return sum1+sum2+sum3+sum4;
    }
}