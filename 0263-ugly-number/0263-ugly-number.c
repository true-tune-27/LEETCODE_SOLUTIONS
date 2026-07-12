bool isUgly(int n) {
    if (n <= 0) return false; // Ugly numbers are positive

    while (n % 2 == 0) n /= 2;
    while (n % 3 == 0) n /= 3;
    while (n % 5 == 0) n /= 5;

    return n == 1; // If only factors were 2, 3, or 5, n should be 1


}