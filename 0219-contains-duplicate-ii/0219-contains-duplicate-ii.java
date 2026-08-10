// class Solution {   //use of hashMap only ,, no use of sliding window
//     public boolean containsNearbyDuplicate(int[] nums, int k) {
//         int n=nums.length;
//         HashMap<Integer,Integer> hm=new HashMap<>();
//         for(int i=0;i<n;i++)
//         {
//             if(hm.containsKey(nums[i]))
//             {
//                 int x=hm.get(nums[i]);
//                 if(Math.abs(x-i)<=k) return true;
//                 else hm.put(nums[i],i);
//             }
//             else
//             {
//                 hm.put(nums[i],i);
//             }
//         }
//         return false;
//     }
// }

 class Solution {   //use of hashset and sliding window
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n=nums.length;
        HashSet<Integer> set=new HashSet<>();
        for(int r=0;r<n;r++)
        {
            if (set.contains(nums[r])) return true;
            set.add(nums[r]);
            if(r>=k)
            {
                set.remove(nums[r-k]);
            }
        }
        return false;
    }
 }