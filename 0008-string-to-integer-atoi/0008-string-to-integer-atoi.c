int myAtoi(char* s) {
   long long int n = atoll(s);
   if (n> INT_MAX) return INT_MAX;
   if(n < INT_MIN) return INT_MIN;
   return (int)n;
    
}