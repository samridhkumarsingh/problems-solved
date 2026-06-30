class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb=new StringBuilder();
        int n=s.length();
        int val=0;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='(') val++;
            
            if(val>1)
            {
                sb.append(s.charAt(i));
            }
            if(s.charAt(i)==')') val--;
        }
        return sb.toString();
    }
}