class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int sum=0;
        int count=0;
        int modu;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            modu=sum%k;
            if(modu<0) modu+=k;
            if(map.containsKey(modu)) count+=map.get(modu);

            map.put(modu,map.getOrDefault(modu,0)+1);
        }
        return count;
    }
}