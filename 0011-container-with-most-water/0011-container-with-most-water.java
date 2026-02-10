class Solution {
    public int maxArea(int[] height) {
        // int ans=0;    //brut force
        // int n=height.length;
        // for(int i=0;i<n;i++)
        // {
        //     for(int j=i+1;j<n;j++)
        //     {
        //         int temp=0;
        //         if(height[i]<height[j])
        //         {
        //             temp=height[i]*(j-i);
        //             ans=Math.max(temp,ans);
        //         }
        //         else{
        //             temp=height[j]*(j-i);
        //             ans=Math.max(temp,ans);
        //         }
        //     }
        // }
        // return ans;

        int n=height.length;
        int ans=0;
        int p=0;
        int h=n-1;
        int temp;
        while(p<h)
        {
         
                if(height[p]<height[h])
                {
                    temp=height[p]*(h-p);
                    ans=Math.max(temp,ans);
                    p++;
                }   
                 else if(height[h]<height[p])
                 {
                    temp=height[h]*(h-p);
                    ans=Math.max(temp,ans);
                    h--;
                }
                 else if(height[p]==height[h])
                  {
                    temp=height[p]*(h-p);
                    ans=Math.max(temp,ans);
                    p++;
                } 
        }
        return ans;
    }
}