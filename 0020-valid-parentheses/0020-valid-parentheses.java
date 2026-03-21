class Solution {
     ArrayList<Character> arr;
     int p;
     int max;
    public boolean isValid(String s) { //
        arr=new ArrayList<>();
         p=0;
        max=s.length();
     
        for(int i=0;i<max;i++)
        {
            char c=s.charAt(i);
            if(c=='('||c=='['||c=='{'){
                push(c);
            }else{
                if(p == 0) return false;
                char d=peek();
                if(c==')'){
                    if(d=='(')
                    {
                        pop();
                    }
                  else{
                    return false;
                    }
                }else if(c==']'){
                    if(d=='[')
                    {
                       pop();
                    }
                  else{
                    return false;
                    }
                } else if(c=='}'){
                    if(d=='{')
                    {
                        pop();
                    }
                  else{
                    return false;
                    }
                } 
            }
        }
 if(p==0) return true;
        else return false;
    }
    public void push(char x) {
        arr.add(x);
        p++;
    }
      public char peek() {
        return arr.get(p-1);
    }
    public void pop() {
        arr.remove(p-1);
        p--;
    }
}