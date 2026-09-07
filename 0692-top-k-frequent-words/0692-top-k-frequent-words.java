class Solution {
    public List<String> topKFrequent(String[] words, int k) {

        HashMap<String, Integer> freq = new HashMap<>();
        List<String> arr = new ArrayList<>();

        for (String word : words) {
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }

        List<Map.Entry<String, Integer>> list =
            new ArrayList<>(freq.entrySet());

        // Sort by frequency descending
        // If frequency is same, sort alphabetically
        list.sort((a, b) -> {
            if (a.getValue().equals(b.getValue())) {
                return a.getKey().compareTo(b.getKey());
            }

            return b.getValue().compareTo(a.getValue());
        });

        Map<String, Integer> sortedMap = new LinkedHashMap<>();

        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        int count = 0;

        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {

            if (count == k) {
                break;
            }

            arr.add(entry.getKey());
            count++;
        }

        return arr;
    }
}