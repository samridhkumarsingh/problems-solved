class Solution {
    public int mySqrt(int x) {
        long low=0,high=x;
        while(low<=high)
        {
            long middle=low+(high-low)/2;
            if(middle*middle==x) return (int)middle;
            else if(middle*middle>x) high=middle-1;
            else if(middle*middle<x)  low=middle+1;
        }

        return (int)high;
    }
}