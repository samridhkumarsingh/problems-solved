class Solution {
    public int[] productExceptSelf(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=1;i<nums.length;i++)
        {
            map.put(i,map.getOrDefault(i-1,1)*nums[i-1]);
        }

             int temp=nums[nums.length-1];
        for(int i=nums.length-1;i>0;i--)
        {
           int temp2=nums[i];
            nums[i]=map.get(i);
            if(i<nums.length-1)
            {
             
             nums[i]=nums[i]*temp;
            temp*=temp2;
            }
        }
        nums[0]=temp;

        return nums;
    }
}