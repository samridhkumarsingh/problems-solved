class Solution {
    public int compress(char[] chars) {
        // String ans=""; string java mei bekar hai iss liye stringbuilder use kr lete hai
        StringBuilder ans=new StringBuilder("");
        int i=0,j=0;
        while(j<chars.length)
        {
            if(chars[j]==chars[i]) j++;
            else{
                ans.append(chars[i]);
                int leng=j-i;
                if(leng>1) ans.append(leng);
                i=j;
            }
        }
        ans.append(chars[i]);
                int leng=j-i;
                if(leng>1) ans.append(leng);
                i=j;

        for(int k=0;k<ans.length();k++)
        {
            chars[k]=ans.charAt(k);
        }
        
        return ans.length();
    }
}