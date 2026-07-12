int addDigits(int num) {
     while (num >= 10) {  // Loop until we get a single-digit result
        int sum = 0;
        while (num > 0) {
            sum += num % 10;  // Extract and add each digit
            num /= 10;        // Reduce the number
        }
        num = sum;  // Update num to the sum of its digits
    }
    return num;  // Final single-digit sum
}

    
