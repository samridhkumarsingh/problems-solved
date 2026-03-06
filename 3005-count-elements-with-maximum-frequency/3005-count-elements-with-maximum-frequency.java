class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(hm.containsKey(nums[i])) hm.put(nums[i],hm.get(nums[i])+1);
            else hm.put(nums[i],1);
        }
        int max=Integer.MIN_VALUE;
        for(int ele : nums)
        {
            max=Integer.max(max,hm.get(ele));
        }
        int count=0;
        for(int ele: hm.values())
        {
            if(ele==max) count++;
        }

        return count*max;
    }
}