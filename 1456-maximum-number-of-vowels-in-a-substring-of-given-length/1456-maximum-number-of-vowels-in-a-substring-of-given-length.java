class Solution {
    public int maxVowels(String s, int k) {
        int left=0;
        int c=0;
        int max=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                c++;
            }
            while(i-left+1>=k)
            {
                max=Math.max(max,c);
                char ch1=s.charAt(left);
                 if(ch1=='a'|| ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u')
                    {
                        c--;
                    }
                    left++;
            }
        }
        return max;
    }
}