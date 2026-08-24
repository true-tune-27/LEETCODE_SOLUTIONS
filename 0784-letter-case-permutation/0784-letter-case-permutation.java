class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> ans = new ArrayList<>();
        char[] arr = s.toCharArray();
        backtrack(arr, 0, ans);
        return ans;
    }

    void backtrack(char[] arr, int i, List<String> ans) {
        if (i == arr.length) {
            ans.add(new String(arr));
            return;
        }

        if (Character.isLetter(arr[i])) {
            arr[i] = Character.toLowerCase(arr[i]);
            backtrack(arr, i + 1, ans);

            arr[i] = Character.toUpperCase(arr[i]);
            backtrack(arr, i + 1, ans);
        } else {
            backtrack(arr, i + 1, ans);
        }
    }
}