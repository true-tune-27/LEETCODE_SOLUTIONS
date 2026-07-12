class Solution {
public:
    vector<int> decimalRepresentation(int n) {
          if (n <= 0) {
        return {};
    }

    vector<int> comp;
    long long power = 1;

    while (n > 0) {
        int digit = n % 10;
        if (digit != 0) {
            comp.push_back(digit * power);
        }
        n /= 10;
        power *= 10;
    }

    reverse(comp.begin(), comp.end());
    return comp;
    }
};