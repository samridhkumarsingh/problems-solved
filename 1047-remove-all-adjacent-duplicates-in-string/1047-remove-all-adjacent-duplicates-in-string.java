// class Solution {
//     public String removeDuplicates(String s) {
//         if(s.length()<=1) return s;
//         StringBuilder str=new StringBuilder(s);
      
//         int p=0,q=1;
//         while(q<str.length())
//         {
//             if(str.charAt(p)==str.charAt(q))
//             {
//                 // str.deleteCharAt(p);  //order of delete will matter  When you delete p first, everything after p shifts one position left. So q changes.
//                 // str.deleteCharAt(q);

//                 str.deleteCharAt(q);  //deleteCharAt() can take O(n) because characters after the deleted position may need to shift.
//                 str.deleteCharAt(p);
//                 if(p>0)
//                 {
//                     p--;
//                 }
//                 q=p+1;
//             }
//             else 
//             {
//                 p++;
//                 q++;
//             }
//         }
//         return str.toString();
        
//     }
// }

//So in the worst case, your solution can become: Time: O(n²) Space: O(n)

class Solution {
    public String removeDuplicates(String s) {
        StringBuilder str=new StringBuilder();

        for(char ch:s.toCharArray())
        {
            int n= str.length();
            if(n>0 && str.charAt(n-1)==ch)
            {
                str.deleteCharAt(n-1);
            }
            else 
            {
                str.append(ch);
            }
        }

        return str.toString();
    }
}