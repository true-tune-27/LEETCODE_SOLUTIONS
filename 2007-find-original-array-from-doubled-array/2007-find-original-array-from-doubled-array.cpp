class Solution {
public:
    vector<int> findOriginalArray(vector<int>& changed) {
       int n = changed.size();
       if(n & 1 ) return {};
       map<int,int>frq;
       for(auto i : changed)
       {
         frq[i]++;
       }
       sort(changed.begin(),changed.end());
       vector<int>ans;
       for(int i = 0 ; i < n ; i++)
       {
          if(frq[changed[i]] == 0) continue ;
          if(frq[2*changed[i]] == 0) return{};
          ans.push_back(changed[i]);
          frq[changed[i]]--;
          frq[2*changed[i]]--;
       }
       return ans;
    }
};