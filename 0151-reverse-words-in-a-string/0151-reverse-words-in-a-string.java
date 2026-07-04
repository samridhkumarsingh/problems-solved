class Solution {
    public String reverseWords(String s) {
    //     StringBuilder sb=new StringBuilder();
    //     int n=s.length();
    //    int p=n-1,q=n-1;
    //    while(p>=0)
    //    {
    //     if(s.charAt(p)!=' ') p--;
    //     else 
    //     {
    //         reverse(s,p+1,q,sb);
    //             q=p-1;
    //             p=q;
    //     }
    //    }
    //    reverse(s,p+1,q,sb);
    //    return sb.toString();
    // }

    // public static void reverse(String s,int p,int q,StringBuilder sb)
    // {
    //     int x=p-1;
    //     while(p<=q)
    //     {
    //         sb.append(s.charAt(p));
    //         p++;
    //     }
    //     if(x>0 ) sb.append(' ');
    // }

    StringBuilder sb=new StringBuilder();
    s=s.trim();
    String[] words=s.split("\\s+");
    for(int i=words.length-1;i>=0;i--)
    {
        sb.append(words[i]);

        if(i>0) sb.append(" ");
    }

    return sb.toString();
    }
}