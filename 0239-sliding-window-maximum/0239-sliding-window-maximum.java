// class Solution {
//     public int[] maxSlidingWindow(int[] nums, int k) {
//         int left=0;
//         int max=Integer.MIN_VALUE;
//         HashMap <Integer,Integer> map=new HashMap<>();
//         List<Integer> list=new ArrayList<>();
//         for(int r=0;r<nums.length;r++)
//         {
//            map.put(r,nums[r]);

//             while(r-left+1>k)
//             {
//                 list.add(max);
//                 map.remove(left);
//                 left++;
//             }
        
//             if(nums[r]>=max) max=nums[r];
//             else if(map.containsValue(max)) continue;
//             else 
//             {
//                 max=Integer.MIN_VALUE;
//                 for (Integer value : map.values()) {
//                         if (value >= max) {
//                             max=value;
//                         }
//                     }
//             }
//         }
//         list.add(max);
//         return list.stream()
//           .mapToInt(Integer::intValue)
//           .toArray();
//     }
// }

// class Solution {
//     public int[] maxSlidingWindow(int[] nums, int k) {

//         int left = 0;
//         int max = Integer.MIN_VALUE;

//         HashMap<Integer, Integer> map = new HashMap<>();
//         List<Integer> list = new ArrayList<>();

//         for (int r = 0; r < nums.length; r++) {

//             map.put(r, nums[r]);

//             // Remove elements outside window
//             if (r - left + 1 > k) {

//                 int removed = map.remove(left);

//                 if (removed == max) {
//                     max = Integer.MIN_VALUE;

//                     for (int value : map.values()) {
//                         max = Math.max(max, value);
//                     }
//                 }

//                 left++;
//             }

//             // Update max
//             max = Math.max(max, nums[r]);

//             // Window has k elements
//             if (r - left + 1 == k) {
//                 list.add(max);
//             }
//         }

//         return list.stream()
//                    .mapToInt(Integer::intValue)
//                    .toArray();
//     }
// }

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums==null || k<=0)
            return new int[0];

        int n=nums.length;
        int[] res=new int[n-k+1];
        int resi=0;

        Deque<Integer> q=new ArrayDeque<>();

        for(int i=0;i<n;i++)
        {
            while(!q.isEmpty() && q.peek()<i-k+1) //remove out of window elements
            {
                q.poll();
            }
            while(!q.isEmpty() && nums[q.peekLast()]<nums[i])
            {
                q.pollLast();
            }
            q.offer(i);
            if(i>=k-1)
            {
                res[resi++]=nums[q.peek()];
            }
        }
        return res;

    }
}