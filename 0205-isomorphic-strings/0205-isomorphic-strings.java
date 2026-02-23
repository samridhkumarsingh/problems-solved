class Solution {
    public boolean isIsomorphic(String s, String t) {
        char[] freq=new char[128];
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            char dh=t.charAt(i);
            int idx=(int)ch;
            if(freq[idx]=='\0')
            {
                freq[idx]=dh;
            }else
            {
                if(freq[idx]!=dh) return false;
            }
            
        }

         char[] b=new char[128];
        for(int i=0;i<s.length();i++)
        {
            char ch=t.charAt(i);
            char dh=s.charAt(i);
            int idx=(int)ch;
            if(b[idx]=='\0')
            {
                b[idx]=dh;
            }else
            {
                if(b[idx]!=dh) return false;
            }
            
        }
        return true;
    }
}