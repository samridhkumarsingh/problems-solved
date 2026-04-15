class Solution {
    public int mySqrt(int x) {
        //with long
        // long low=0,high=x;
        // while(low<=high)
        // {
        //     long middle=low+(high-low)/2;
        //     if(middle*middle==x) return (int)middle;
        //     else if(middle*middle>x) high=middle-1;
        //     else if(middle*middle<x)  low=middle+1;
        // }

        // return (int)high;

        //without long 
        if(x<=1) return x;
        int low=0,high=x;
        while(low<=high)
        {
            int middle=low+(high-low)/2;
            if(middle==x/middle) return middle;
            else if(middle>x/middle) high=middle-1;
            else if(middle<x/middle)  low=middle+1;
        }

        return high;
    }
}