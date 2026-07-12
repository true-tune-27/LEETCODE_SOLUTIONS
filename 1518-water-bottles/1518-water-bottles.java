class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
            int sum = numBottles;
        while(numBottles >= numExchange)
        {
            int k = numBottles/ numExchange;
            int l = numBottles %  numExchange;
            sum += k;
            numBottles = k+l;
        }
        return sum;
    }
}