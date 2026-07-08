class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList<>();
        sub(0,0,"",n,list);
        return list;
    }
    public  void sub(int open,int close,String ans, int n,List<String> list)
    {   
      
        if(ans.length()==(n*2))
        {
            list.add(ans);
            return;
        }
        if(open<n)
        {
            sub(open+1,close,ans+'(',n,list);
          
        }
      //  if(ans.length()!=0 && close<open)
        if(close<open)
        {
              sub(open,close+1,ans+')',n,list);
             
        }
    }

}