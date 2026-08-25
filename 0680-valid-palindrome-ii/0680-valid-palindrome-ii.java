// class Solution {
//     public boolean validPalindrome(String s) {
//         int p=0,q=s.length()-1;
//         int r=1,t=1;
//         while(p<=q)
//         {
//             if(s.charAt(p)!=s.charAt(q) && r>0)
//            {
//                 p++;
//                 r--;
//                // if(s.charAt(p)==s.charAt(q)) t--;
//            }
//            else if(s.charAt(p)!=s.charAt(q) && r==0 && t>0)
//            {
//             p--;
//             q--;
//             t--;
//            }
//            else if(s.charAt(p)!=s.charAt(q))
//             {
//                 return false;
//             }
//             else
//            {
//             p++;
//             q--;
//            }
//         }
//         return true;
//     }
// }

class Solution {

    public boolean validPalindrome(String s) {

        int p = 0;
        int q = s.length() - 1;

        while (p < q) {

            if (s.charAt(p) != s.charAt(q)) {

                // Try deleting the left character
                int left = p + 1;
                int right = q;

                boolean option1 = true;

                while (left < right) {
                    if (s.charAt(left) != s.charAt(right)) {
                        option1 = false;
                        break;
                    }

                    left++;
                    right--;
                }

                // Try deleting the right character
                left = p;
                right = q - 1;

                boolean option2 = true;

                while (left < right) {
                    if (s.charAt(left) != s.charAt(right)) {
                        option2 = false;
                        break;
                    }

                    left++;
                    right--;
                }

                return option1 || option2;
            }

            p++;
            q--;
        }

        return true;
    }
}