class Solution {
    public int findMaxLength(int[] nums) {
        // int n=nums.length;//brute force
        // int maxlength=0; 
        // for(int i=0;i<n;i++) 
        // {
        //     int count0=0;
        //     int count1=0;

        //     for(int j=i;j<n;j++)
        //     {
        //         if(nums[j]==0)
        //         {
        //             count0++;
        //         }else
        //         {
        //             count1++;
        //         } 
        //         if(count0==count1)
        //         {
        //             int length=j-i+1;
        //             maxlength=Math.max(maxlength,length);
        //         }
        //     }
        // }
        // return maxlength;
        
        int sum=0;
        int n=nums.length;
        int length=0;
        int maxlength=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<n;i++)
        {
        if(nums[i]==0) sum+=(-1);
        else sum+=1;
        if(map.containsKey(sum)){
            length=i-map.get(sum);
            maxlength=Math.max(length,maxlength);
        }
       else map.put(sum,i);
        }

        return maxlength;
    }
}