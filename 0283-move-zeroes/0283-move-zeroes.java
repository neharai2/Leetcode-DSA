class Solution {
    public void moveZeroes(int[] nums) {

int start = 0;
int end = nums.length -1;
        while(start <= end){
        for(int i = 0; i< nums.length-1; i++){
            if(nums[i] == 0){
                int temp = nums[i];
                nums[i] = nums[i+1];
                nums[i+1] = temp;
            }
           
        }
        start++;
        }

        
        
    }
}