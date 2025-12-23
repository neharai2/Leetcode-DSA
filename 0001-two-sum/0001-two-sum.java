class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> newMap = new HashMap<>();
    

        for(int i = 0; i< nums.length; i++){
      

        if(!newMap.containsKey(target - nums[i])){

        newMap.put(nums[i], i);
            
        }
        else{

       return new int[] {newMap.get(target - nums[i]), i};

      
        }
        }


        return new int[]{};
    }
}