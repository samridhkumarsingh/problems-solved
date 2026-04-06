import java.util.*;

class Solution {
//     public void sub(int indx, List<Character> ans, List<String> rsl, String t)
//     {
//         if(indx >= t.length())
//         {
//             StringBuilder sb = new StringBuilder();

//             for(char c : ans)
//             {
//                 sb.append(c);
//             }

//             rsl.add(sb.toString());
//             return;
//         }

//         ans.add(t.charAt(indx));
//         sub(indx+1, ans, rsl, t);

//         ans.remove(ans.size()-1);

//         sub(indx+1, ans, rsl, t);
//     }

//     public boolean isSubsequence(String s, String t) {

//         List<Character> ans = new ArrayList<>();
//         List<String> rsl = new ArrayList<>();

//         sub(0, ans, rsl, t);

//         return rsl.contains(s);
//     }

 public boolean isSubsequence(String s, String t)
 {
    int p=0,q=0;
    while(p<s.length()&& q<t.length())
    {
        if(s.charAt(p)==(t.charAt(q)))
        {
            p++;
            q++;
        }
        else
        {
            q++;
        }
    }
   return (p==s.length());


 }
}