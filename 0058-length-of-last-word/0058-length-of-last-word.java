class Solution {
    public int lengthOfLastWord(String s) {
        int max=s.length();

      int i=max-1;
        while(i>=0 && s.charAt(i)==' ')
        {
            i--;
        }
        int length=0;
        while(i>=0 && s.charAt(i)!=' ')
        {
            length++;
            i--;
        }
        return length;
    }
}