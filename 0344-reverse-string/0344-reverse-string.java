class Solution {
    public void reverseString(char[] s) {
        // char swap;
        // for(int i=0;i<s.length/2;i++)
        // {
        //     swap=s[i];
        //     s[i]=s[s.length-1-i];
        //     s[s.length-1-i]=swap;
        // }

        reverse(s,0,s.length-1);
    }
    public void reverse(char[] s,int left ,int right)
    {
        if(left>=right) return;

        char swap=s[left];
        s[left]=s[right];
        s[right]=swap;

        reverse(s,left+1,right-1);
    }
}