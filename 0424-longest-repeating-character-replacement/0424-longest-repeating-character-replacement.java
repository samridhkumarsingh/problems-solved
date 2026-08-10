class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map= new HashMap<>();
        int left=0;
        int maxfiq=0;
        int ans=0;
        for(int rg=0;rg<s.length();rg++)
        {
            char ch=s.charAt(rg);
            map.put(ch,map.getOrDefault(ch,0)+1);
            maxfiq=Math.max(maxfiq,map.get(ch));

            while((rg-left+1)-maxfiq >k)
            {
                char ch2=s.charAt(left);
                map.put(ch2,map.get(ch2)-1);
                left++;
            }

            ans=Math.max(ans,rg-left+1);
        }
        return ans;
    }
}