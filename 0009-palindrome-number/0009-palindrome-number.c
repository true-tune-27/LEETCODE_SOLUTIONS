bool isPalindrome(int x) {
    long long original =x;
    long long rem,rev=0;
    if(x<0) return 0;

    	while(x != 0)
	{
		rem = x%10;
		rev = rev*10+ rem;
		x = x/10;		
	}
    if(rev == original) return 1;
    else return 0;
    
        
}