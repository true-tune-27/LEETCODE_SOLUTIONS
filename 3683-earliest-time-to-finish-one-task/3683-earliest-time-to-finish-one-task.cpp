class Solution {
public:
    int earliestTime(vector<vector<int>>& tasks) {
        int Earliest = INT_MAX;
        for(auto&k : tasks)
            {
                int start_point = k[0];
                int duration_point  = k[1];
                int finish_time = start_point + duration_point;
                Earliest = min(Earliest,finish_time);
            }
        return Earliest;
    }
};