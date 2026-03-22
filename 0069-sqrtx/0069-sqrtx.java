class Solution {
    public int mySqrt(int x) {//normal approch
        if(x==0 || x==1) return x;

        for(int i=2;i<=x/2;i++)
        {
            if((long)i*i==x) return i;
            else if((long)i*i>x) return i-1;
        }
        return x/2;
    }
}