class Solution {
    public int firstUniqChar(String s) {
        // for(int i=0;i<s.length();i++)
        // {
        //     boolean isunique=true;
        //     for(int j=0;j<s.length();j++)
        //     {
        //        if(i != j && s.charAt(i) == s.charAt(j))
        //         {
        //             isunique=false;
        //         }
        //     }
        //     if(isunique)
        //     {
        //         return i;
        //     }
        // }
        // return -1;
        int[] freq=new int[26];
        char non=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            int index=(int) ch-97;
            freq[index]++;
        }
        for(int j=0;j<s.length();j++)
        {
            char ch=s.charAt(j);
            int index=(int) ch-97;
            if(freq[index]==1)
            {
                return j;
            }
        }
      
        return -1;
    }
}