class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        int[] output = new int[seats.length];
        Arrays.sort(seats);
        Arrays.sort(students);
        for(int i =0 ; i < seats.length ; i++)
        {
            output[i] = Math.abs(seats[i] - students[i]);
        }
        int sum = 0;

        for(int i = 0 ; i < seats.length ; i++)
        {
            sum+= output[i];
            
        }
        return sum;
    }
}