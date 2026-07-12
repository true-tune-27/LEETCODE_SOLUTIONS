class Solution {
    public String convertDateToBinary(String date) {
           StringBuilder ans =  new StringBuilder();
        String[] arr = date.split("-");
        for(int i = 0;i<arr.length;i++){
            int value = Integer.parseInt(arr[i]);
            String ff = Integer.toBinaryString(value);
            ans.append(ff);
            if(i != arr.length-1){
                ans.append('-');
            }
        }
        return ans.toString();
    }
}