long long int divide(int dividend, int divisor) {
    long long int m = (long long int)dividend / divisor;
    if(dividend == INT_MIN && divisor == -1)
    return m = INT_MAX;
    m = dividend / divisor;
    return m ;
    
}