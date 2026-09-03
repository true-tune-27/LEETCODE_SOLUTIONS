class Solution {
public:
    int minBitFlips(int start, int goal) {
        int left = start ^ goal;
        int c = 0;
        while (left){
            if (left & 1)c++;
            left = left >> 1;   
        }
        return c;
    }
};