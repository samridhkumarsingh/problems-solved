class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> r=new LinkedList<>();
        Queue<Integer> d=new LinkedList<>();
        int n=senate.length();
        int p=n;
        for(int i=0;i<n;i++)
        {
            if(senate.charAt(i)=='R') r.add(i);
            else d.add(i);
        }
        while(!r.isEmpty() && !d.isEmpty())
        {
            if(r.peek()<d.peek())
            {
                d.remove();
                r.remove();
                r.add(p++);
            }
            else
            {
                 r.remove();
                d.remove();
                d.add(p++);
            }
        }
        if(r.isEmpty()) return "Dire";
        else return "Radiant";
        
    }
}