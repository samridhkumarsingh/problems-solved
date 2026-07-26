class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack <Integer> st=new Stack<>();

        // int p=0,q=0;        //wrong
        // int n=pushed.length;
        // while(q<n)
        // {
        //     if(st.isEmpty())
        //     {
        //         st.push(pushed[p]);
        //         p++;
        //     }
        //     int val=st.peek();
        //     if(val==popped[q]) 
        //     {
        //         st.pop();
        //         q++;
        //     }
        //     else 
        //     {
        //         st.push(pushed[p]);
        //         p++;
        //     }
        // }

        int q=0;
        for(int val: pushed)
        {
            st.push(val);
            while(!st.isEmpty() && st.peek()==popped[q])
            {
                st.pop();
                q++;
            }
        }
        return st.isEmpty();
    }
}