class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] ans=new int[n];
        int x=bookings.length;
        for(int i=0;i<x;i++)
        {
            int start=bookings[i][0];
            int ends=bookings[i][1];
            int temp=bookings[i][2];
            for(int j=start-1;j<ends;j++)
            {
                ans[j]+=temp;
            }
        }
        return ans;
    }
}