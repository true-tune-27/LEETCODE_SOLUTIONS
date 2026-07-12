class Solution {
public:
    int countMatches(vector<vector<string>>& items, string ruleKey, string ruleValue) {
        int cnt1 = 0, cnt2 = 0, cnt3 = 0;        
        for(int i = 0 ; i < items.size() ; i++)
        {            
                if(ruleKey == "color")
                {
                    if(items[i][1] == ruleValue)
                    {
                        cnt1++;
                    }
                }
                else if(ruleKey =="type")
                {
                    if(items[i][0] == ruleValue)
                    {
                        cnt2++;
                    }
                }
                else if(ruleKey == "name")
                {
                    if(ruleValue == items[i][2])
                    {
                        cnt3++;
                    }
                }
            
        }
        return cnt1+cnt2+cnt3;
    }
};