class Solution {
    public int findDuplicate(int[] nums) {

        Set<Integer> newSet = new HashSet<>();
        int result = 0;

        for(int i = 0; i< nums.length; i++){
            if(newSet.contains(nums[i])){
                result = nums[i];
            }
            else{
                newSet.add(nums[i]);
            }
        }

        return result;

        
    }
}