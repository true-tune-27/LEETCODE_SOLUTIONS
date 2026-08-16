class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int time = 0;
        int floor = 0;
        for(int request : requests)
            {
                time += Math.abs(floor - request);
                floor = request;
                                
            }
        return time;
    }
}