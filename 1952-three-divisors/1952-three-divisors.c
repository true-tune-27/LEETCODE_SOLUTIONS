bool isThree(int n) {
    int fc =0 ;
    for(int i = 1 ; i <= n ; i ++)
    {
        if(n % i == 0)
        {
            fc++;
        }
    }
    if(fc == 3) return true;
    else return false;
}