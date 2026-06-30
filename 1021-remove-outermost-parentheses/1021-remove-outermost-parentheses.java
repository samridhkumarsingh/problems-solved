class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb=new StringBuilder();
        int n=s.length();
        int val=0;
        for(int i=0;i<n;i++)
        {
           if (s.charAt(i) == '(') {
                 if (val > 0) sb.append('(');
                      val++;
            } else {
                 val--;
                 if (val > 0) sb.append(')');
            }
        }
        return sb.toString();
    }
}