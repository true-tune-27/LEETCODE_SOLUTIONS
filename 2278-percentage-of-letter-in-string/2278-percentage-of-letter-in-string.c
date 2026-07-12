int percentageLetter(char* s, char letter) {
    int len = strlen(s);
    int count=0;
    for(int i=0;i <len ; i++)
    {
        if(letter == s[i])
        {
            count++;
        }
    }
    int n = (count*100)/len;
    return n;
}