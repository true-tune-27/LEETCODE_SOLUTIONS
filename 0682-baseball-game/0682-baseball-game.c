int calPoints(char** operations, int operationsSize) {
    int st[1001];
    int top = -1;
    for(int i = 0;i<operationsSize;i++){
        char ch = operations[i][0];
        if(ch != 'C' && ch != 'D' && ch != '+'){
            st[++top] = atoi(operations[i]); // push
        } 
        else if(ch == 'C') // pop
        {
            top--;
        }
           else if(ch == 'D')
        {
            int d = st[top]*2;
            st[++top] = d; // push doubled value into the stack
    }
    else {
        int a = st[top] + st[top-1];
        st[++top] = a; //  push sum
    }

}
int sum =0;
for(int i = top;i>=0;i--) sum+= st[i];
return sum;
    
}