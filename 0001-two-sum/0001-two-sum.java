class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> start = new HashMap<>();

        for(int i = 0; i< nums.length; i++){
            int com = target - nums[i];

            if(start.containsKey(com)){
                 return new int[]{start.get(com), i};
            }
            else{
                start.put(nums[i], i);
            }
            
        }
        return new int[]{};
    }
}