/*class Solution {
    public int findDuplicate(int[] nums) {  //slow fast method
       int slow =0;
       int fast=0;
       do{
        slow=nums[slow];
        fast=nums[nums[fast]];
       }while(slow!=fast);
       fast=0;
       while(slow!=fast)
       {
        slow=nums[slow];
        fast=nums[fast];
       }
      return slow;  
    }
}*/
/*class Solution {
    public int findDuplicate(int[] nums) {  //xor method
        int n;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++)
        {
            
            n=nums[i] ^ nums[i+1];
            if(n==0)
            {
                return nums[i];
            }
        }
        return 0;
    }
} */
class Solution {
     public void swap(int i,int j,int[] nums)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public int findDuplicate(int[] nums) { //cycle method //modifying the array

        int n=nums.length;
        while(true)
       {
        int ele=nums[0];
        if(nums[ele]==ele) return ele;
        swap(0,ele,nums);

       }

    }
}