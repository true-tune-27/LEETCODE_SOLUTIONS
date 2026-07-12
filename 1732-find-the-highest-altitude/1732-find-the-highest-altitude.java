class Solution {
    public int largestAltitude(int[] gain)
     {
        int[] output = new int[gain.length+1];
        int sum = 0 ;
        Arrays.fill(output,0);
        for(int i = 0 ; i < gain.length ;i++)
        {
            sum += gain[i];
            output[i+1] = sum;
        }        
        Arrays.sort(output);
        return output[gain.length];
    }
}