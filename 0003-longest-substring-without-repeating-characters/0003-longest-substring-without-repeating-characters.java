class Solution {
    public int lengthOfLongestSubstring(String s) {
        int right=0,left=0;  //slidding window
        int n=s.length();
        int max=0,c=0;
        HashMap<Character,Integer> map=new HashMap<>();
        while(right<n)
        {
            if(map.containsKey(s.charAt(right)))
            {
                c=right-left;
                max=Math.max(max,c);
                left=Math.max(left,map.get(s.charAt(right))+1);
            }
            map.put(s.charAt(right),right);
            right++;
            
        }
         c=right-left;
         max=Math.max(max,c);

        return max;
    }
}