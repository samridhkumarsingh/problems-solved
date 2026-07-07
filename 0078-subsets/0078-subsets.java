class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> rsl=new ArrayList<>();
        set(0,nums,list,rsl);
        return list;
        
    }
    public void set(int index,int[] nums,List<List<Integer>>list,List<Integer>rsl)
    {
        if(index==nums.length)
        {
            list.add(new ArrayList <>(rsl));
            return;
        }

         rsl.add(nums[index]);
        set(index+1,nums,list,rsl);// take
        rsl.remove(rsl.size()-1);
        set(index+1,nums,list,rsl);//not take

    }
}