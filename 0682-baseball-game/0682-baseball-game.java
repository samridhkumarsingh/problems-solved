class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> st=new Stack<>();
        int sum=0;
        for(int i=0;i<ops.length;i++)
        {
            if(ops[i].equals("C"))
            {
                if(!st.isEmpty())
                 st.pop();
            }
            else if(ops[i].equals("D"))
            {
                int x=st.peek();
                st.push(2*x);
            }
            else if(ops[i].equals("+"))
            {
                int a=st.pop();
                int b=st.pop();
                int c=a+b;
                st.push(b);
                st.push(a);
                st.push(c);
            }
            else
            {
                int num = Integer.parseInt(ops[i]);
                st.push(num);
            }
        }

        while(!st.isEmpty())
        {
            sum+=st.pop();
        }
        return sum;
    }
}