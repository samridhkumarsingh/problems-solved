class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        StringBuilder hm=new StringBuilder("");
        int n1=word1.length();
        int n2=word2.length();
        int p=0;
        while(p<n1 && p<n2)
        {
            hm.append(word1.charAt(p));
            hm.append(word2.charAt(p));
            p++;
        }
        hm.append(word1.substring(p));
        hm.append(word2.substring(p));

        String s=hm.toString();
        return s;
    }
}