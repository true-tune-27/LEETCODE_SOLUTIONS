class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        
        int odd=0,found=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                odd++;
                if(odd==3){
                    found=1;
                }
        }
        else{
            odd=0;
        }
            
        }
        if(found==1){
            return true;
        }
        else{
            return false;    
        }
    }
}