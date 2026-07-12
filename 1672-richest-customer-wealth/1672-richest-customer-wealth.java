class Solution {
    public int maximumWealth(int[][] accounts) {
    
        int rsum = 0;
        int res =0 ;
        for(int i = 0 ; i < accounts.length ; i ++)
        {
            for(int j = 0 ; j < accounts[i].length ; j ++)
            {
                rsum += accounts[i][j];
            }
           if(res < rsum){
            res = rsum ;
           }
           rsum = 0;
        }
      return res;
      
    }
}