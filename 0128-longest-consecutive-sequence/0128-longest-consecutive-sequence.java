class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
         Set<Integer>keys=new HashSet<>();
    
         for(int num :nums)
         {
           keys.add(num);
         }
          int count =0;
        for(int num :keys)
        {
            if(!keys.contains(num-1))
            {
                int steak=1;
                int current=num;
                while(keys.contains(current+1))
                {
                    steak++;
                    current++;
                }
                count=Math.max(steak,count);
            }
        }
        return count;
    }
}