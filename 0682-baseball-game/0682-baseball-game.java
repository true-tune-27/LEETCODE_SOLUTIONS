class Solution {
    public int calPoints(String[] operations) { 
        Stack<Integer>scores = new Stack<>();
        for(int  i = 0 ; i < operations.length ; i++)
        {
            if(operations[i].equals("C"))
            {
                scores.pop();
            }
            else if(operations[i].equals("D"))
            {
                scores.push(scores.peek()*2);
            }
            else if(operations[i].equals("+"))
            {
                int size = scores.size();
                scores.push(scores.get(size-1) + scores.get(size-2));
            }
            else
            {
                scores.push(Integer.parseInt(operations[i]));
            }
        }
        int sum = 0 ;
        while(!scores.empty())
        {
            sum += scores.pop();
        }
        return sum;
    }
}