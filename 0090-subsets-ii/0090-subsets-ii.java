class Solution {
    public void sub(List<List<Integer>>rsl,List<Integer>ans,int indx,int[] nums)
    {
       
            rsl.add(new ArrayList<>(ans));
   
       
        for(int i=indx;i<nums.length;i++)
        {
            if(i>indx && nums[i]==nums[i-1])
            {
                continue;
            }
            ans.add(nums[i]);
            sub(rsl,ans,i+1,nums);
            ans.remove(ans.size()-1);
            
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> rsl=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        Arrays.sort(nums);
        sub(rsl,ans,0,nums);
        return rsl;
    }
}