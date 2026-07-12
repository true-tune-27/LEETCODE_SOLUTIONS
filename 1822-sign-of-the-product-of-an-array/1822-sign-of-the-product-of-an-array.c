int arraySign(int* nums, int numsSize) {
    int count1=0,count2=0,count3=0;
    for(int i=0;i<numsSize;i++)
    {
        if(nums[i] < 0)
        count1++;
        else if(nums[i] == 0)
        count2++;
        else
        {
            count3++;
        }
    }
    if(count1 % 2 != 0 && count2 == 0) return -1;
    else if(count2 > 0) return 0;
    else return 1;
   
    
}