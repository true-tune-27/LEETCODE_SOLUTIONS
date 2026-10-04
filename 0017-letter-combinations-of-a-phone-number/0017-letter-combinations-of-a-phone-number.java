class Solution {
    public void backtrack(
        int level, 
        String digits, 
        List<String> res, 
        Map<Character, String> map,
        StringBuilder builder
    ) {
        if(digits.length() == builder.length()) {
            res.add(builder.toString());
            return;
        }

        char c = digits.charAt(level);
        String choices = map.get(c);

        for(char choice : choices.toCharArray()) {
            builder.append(choice);
            backtrack(level+1, digits, res, map, builder);
            builder.deleteCharAt(builder.length()-1);
        }
    }
    public List<String> letterCombinations(String digits) {

        List<String> res = new ArrayList<>();
        Map<Character, String> map = new HashMap<>();

        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        StringBuilder builder = new StringBuilder();

        if(digits.length() == 0) return res;

        backtrack(0, digits, res, map, builder);

        return res;
    }
}