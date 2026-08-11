class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> maps=new HashMap<>();
        HashMap<Character,Integer> mapt=new HashMap<>();
        for(int i=0;i<t.length();i++)
        {
            char ch=t.charAt(i);
            mapt.put(ch,mapt.getOrDefault(ch,0)+1);
        }
        int left=0;

         int have = 0;
        int need = mapt.size();

        int leftpoint=-1,rightpoint=-1;
        int length=Integer.MAX_VALUE;

        for(int rg=0;rg<s.length();rg++)
        {
            char ch1=s.charAt(rg);
            maps.put(ch1,maps.getOrDefault(ch1,0)+1);

             // Check if this character's required frequency is satisfied
            if (mapt.containsKey(ch1)
                    && maps.get(ch1).intValue() == mapt.get(ch1).intValue()) {
                have++;
            }

            // while(maps.entrySet().containsAll(mapt.entrySet()))
            while (have == need)
            {
                if(length>rg-left+1)
                {
                    length=rg-left+1;
                    rightpoint=rg;
                    leftpoint=left;
                }

                char leftChar = s.charAt(left);
                maps.put(leftChar,maps.get(leftChar)-1);

                // if(maps.get(s.charAt(left))==0) maps.remove(s.charAt(left));
                   if (mapt.containsKey(leftChar)&& maps.get(leftChar) < mapt.get(leftChar)) {
                    have--;
                }
                left ++;
            }
        }
        if(leftpoint!=-1 && rightpoint!=-1)
        {
            String ans=s.substring(leftpoint,rightpoint+1);
            return ans;
        }

        return "";
    }
}