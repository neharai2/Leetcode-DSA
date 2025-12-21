class Solution {
    public int missingNumber(int[] nums) {
        int length = nums.length;
       int sum = (length * (length + 1))/2;
     

       int sum2 = 0;

       for(int i : nums){
        sum2 += i;
       }


     return (sum - sum2);
      
      
    }
}