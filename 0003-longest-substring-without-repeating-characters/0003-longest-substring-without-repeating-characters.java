class Solution {
    public int lengthOfLongestSubstring(String s) {
       HashMap<Character,Integer> hm=new HashMap<>();
    //    int c=0;   wrong approach
    //    int max=0;
    //    int p=0;
    //    int n=s.length();
    //    while(p<n)
    //    {
    //     if(hm.containskey(s.charAt(p)))
    //     {
    //         max=Integer.max(c,max);
    //         p=hm.get(s.charAt(p))+1;
    //         c=0;
    //     }
    //     else
    //     {
    //         c++;
    //         hm.put(s.chartAt(p),p);
    //         p++;
    //     }
    //    }

    //    return max;

    int left=0;
    int n=s.length();
    int max=0;

    for(int right=0;right<n;right++)
    {
        char ch=s.charAt(right);
        if(hm.containsKey(ch))
        {
            left=Math.max(left,hm.get(ch)+1);
        }
        hm.put(ch,right);
        max=Math.max(max,right-left+1);
    }

    return max;
    }
}