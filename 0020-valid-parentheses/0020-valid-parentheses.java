class Solution {
     ArrayList<Character> arr;
     int p;
     int max;
    public boolean isValid(String s) {
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
        // Inserts x at the top of the stack
        arr.add(x);
        p++;
    }
      public char peek() {
        // Returns the top element of the stack

        return arr.get(p-1);
    }
    public void pop() {
        // Removes an element from the top of the stack

        arr.remove(p-1);
        p--;
    }
}