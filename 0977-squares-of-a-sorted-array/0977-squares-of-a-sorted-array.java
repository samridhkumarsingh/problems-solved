
class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        // Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n-1;i++) //bubble sort
        {
            for(int j=0;j<n-1-i;j++)
            {
              if(nums[j]>nums[j+1])
              {
                int temp=nums[j];
                nums[j]=nums[j+1];
                nums[j+1]=temp;
              }
            }
        }
        return nums;
    }
}