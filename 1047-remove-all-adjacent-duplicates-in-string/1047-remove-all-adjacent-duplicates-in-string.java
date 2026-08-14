class Solution {
    public String removeDuplicates(String s) {
        if(s.length()<=1) return s;
        StringBuilder str=new StringBuilder(s);
      
        int p=0,q=1;
        while(q<str.length())
        {
            if(str.charAt(p)==str.charAt(q))
            {
                // str.deleteCharAt(p);  //order of delete will matter  When you delete p first, everything after p shifts one position left. So q changes.
                // str.deleteCharAt(q);

                str.deleteCharAt(q);
                str.deleteCharAt(p);
                if(p>0)
                {
                    p--;
                }
                q=p+1;
            }
            else 
            {
                p++;
                q++;
            }
        }
        return str.toString();
        
    }
}