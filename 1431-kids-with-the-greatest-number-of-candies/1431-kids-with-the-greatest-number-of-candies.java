class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];
        for(int candy : candies)
        {
            if(max < candy)
            {
                max = candy;
            }
        }
        int[] result = candies.clone();
        List<Boolean>result2 = new ArrayList<>();
        for(int i=0 ; i < candies.length ;i++)
        {
            result[i] += extraCandies;
            if(result[i] >= max)
            {
                result2.add(true);
            }
            else
            {
                result2.add(false);
            }
        }
        return result2;
    }
}