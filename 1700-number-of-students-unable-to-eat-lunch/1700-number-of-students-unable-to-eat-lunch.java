class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int Zero=0;
        int One=0;
        for(int x:students)
        {
            if(x==0) Zero++;
            else One++;
        }
        for(int x:sandwiches)
        {
            if(x==0 && Zero>0) Zero--;
            else if(x==1 && One>0) One--;
            else if(x==0 && Zero==0) return One;
            else return Zero;
        }
        return 0;
    }
}