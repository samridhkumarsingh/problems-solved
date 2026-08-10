class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer> map=new HashMap<>();
        HashMap<Character,Integer> window=new HashMap<>();
        int n=s1.length();
        for(int i=0;i<n;i++)
        { 
            char ch=s1.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int m=s2.length();
        int left=0;
        for(int rg=0;rg<m;rg++)
       {

        char ch1=s2.charAt(rg);
        window.put(ch1,window.getOrDefault(ch1,0)+1);
       
       if(rg-left+1>n)
       {
        char leftchar=s2.charAt(left);
        window.put(leftchar,window.get(leftchar)-1);

        if(window.get(leftchar)==0)
       {
        window.remove(leftchar);
       }
       left++;
       }
       if(window.equals(map)) return true;
       }

       return false;
    }
}