class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        int n=heights.length;
        int[] arr=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++)
        {
            while(!st.isEmpty() && heights[st.peek()]<=heights[i])
            {
                arr[st.peek()]+=1;
                st.pop();
            }
            if(!st.isEmpty())
            {
                arr[st.peek()]++;
            }
            st.push(i);
        }
        return arr;
    }
}