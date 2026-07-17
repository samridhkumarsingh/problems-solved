// class Solution {
//     public int largestRectangleArea(int[] heights) {
//         int n=heights.length;
//         int[] lse=new int[n];
//         int[] rse=new int[n];
//         Stack<Integer> stl=new Stack<>();
//         Stack<Integer> str=new Stack<>();
//         for(int i=0;i<n;i++) //left smaller element
//         {
          
//             while(!stl.isEmpty()&& heights[stl.peek()]>=heights[i])
//             {
//                 stl.pop();
//             }
//             if(stl.isEmpty())
//             {
//                 lse[i]=0;
//             }
//             else
//             {
//                 lse[i]=stl.peek()+1;
//             }
//             stl.push(i);
//         }
//           for(int i=n-1;i>=0;i--) //right smaller element
//         {
          
//             while(!str.isEmpty()&& heights[str.peek()]>=heights[i])
//             {
//                 str.pop();
//             }
//             if(str.isEmpty())
//             {
//                 rse[i]=n-1; //last tak ja skta hai na 
//             }
//             else
//             {
//                 rse[i]=str.peek()-1;
//             }
//             str.push(i);
//         }

//         int max=0;
//         for(int i=0;i<n;i++)
//         {
//             max=Math.max(max,((rse[i]-lse[i])+1)*heights[i]);
//         }
//         return max;
//     }
// }

class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int[] lse=new int[n];
        int[] rse=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++) //left smaller element
        {
          
            while(!st.isEmpty()&& heights[st.peek()]>=heights[i])
            {
                st.pop();
            }
            if(st.isEmpty())
            {
                lse[i]=0;
            }
            else
            {
                lse[i]=st.peek()+1;
            }
            st.push(i);
        }

        while(!st.isEmpty())  //making stack empty for another use
        {
            st.pop();
        }

          for(int i=n-1;i>=0;i--) //right smaller element
        {
          
            while(!st.isEmpty()&& heights[st.peek()]>=heights[i])
            {
                st.pop();
            }
            if(st.isEmpty())
            {
                rse[i]=n-1; //last tak ja skta hai na 
            }
            else
            {
                rse[i]=st.peek()-1;
            }
            st.push(i);
        }

        int max=0;
        for(int i=0;i<n;i++)
        {
            max=Math.max(max,((rse[i]-lse[i])+1)*heights[i]);
        }
        return max;
    }
}