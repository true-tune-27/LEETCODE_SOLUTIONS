bool isPerfectSquare(int num) {
    int a = sqrt(num);
    if(sqrt(num) == num/a) return 1;
    else return 0;

    
}