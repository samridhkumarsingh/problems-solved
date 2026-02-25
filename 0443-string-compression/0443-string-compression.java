class Solution {
    public int compress(char[] chars) {
        String ans="";
        int i=0,j=0;
        while(j<chars.length)
        {
            if(chars[j]==chars[i]) j++;
            else{
                ans+=chars[i];
                int leng=j-i;
                if(leng>1) ans+=leng;
                i=j;
            }
        }
        ans+=chars[i];
                int leng=j-i;
                if(leng>1) ans+=leng;
                i=j;

        for(int k=0;k<ans.length();k++)
        {
            chars[k]=ans.charAt(k);
        }
        
        return ans.length();
    }
}