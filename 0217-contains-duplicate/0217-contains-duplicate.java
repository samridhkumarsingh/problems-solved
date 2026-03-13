class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> arr=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(arr.containsKey(nums[i])) return true;
            else arr.put(nums[i],1);

        }
        return false;
    }
}