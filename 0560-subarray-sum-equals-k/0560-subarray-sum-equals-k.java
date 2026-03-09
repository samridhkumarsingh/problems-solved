class Solution {
    public int subarraySum(int[] nums, int k) {
        // int count=0; //brute force
        // int n=nums.length;
        // for(int i=0;i<n;i++)
        // {
        //     int sum=0;
        //     for(int j=i;j<n;j++)
        //     {
        //         sum+=nums[j];
        //         if(sum==k){
        //             count++;
                  
        //         }
        //     }
        // }

        // return count;

        int n=nums.length;
        int count=0;
        int[] prefixSum= new int[n];
        prefixSum[0]=nums[0];

        for(int i=1;i<n;i++)
        {
            prefixSum[i]=prefixSum[i-1]+nums[i];
        }

        HashMap<Integer,Integer>Map =new HashMap<>();

        for(int j=0;j<n;j++)
        {
            if(prefixSum[j]==k)
            {
                count++;
            }

            int val=prefixSum[j]-k;
            if(Map.containsKey(val))
            {
                count+=Map.get(val);
            }
            if(Map.containsKey(prefixSum[j]))
            {
                Map.put(prefixSum[j],Map.get(prefixSum[j])+1);
            }
            else
            {
                Map.put(prefixSum[j],1);
            }

          
        }

        return count;
    }
}