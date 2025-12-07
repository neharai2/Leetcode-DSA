class Solution {
    public int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        

        while(start < end){
            if(nums[start] == nums[start + 1]){
                start = start + 2;
            }
            else{
              return nums[start];
            }
        }
       
        return nums[start];
    }
}