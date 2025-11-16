/**
 * @param {number[]} nums
 * @param {number} val
 * @return {number}
 */
var removeElement = function(nums, val) {
    const map = new Map();

   for( let i = 0; i< nums.length; i++){
    if(nums[i] !== val){
       map.set(nums[i], (map.get(nums[i]) || 0) + 1);
        }
    }

   
    let index = 0;
    for (let [key, count] of map) {
        for (let i = 0; i < count; i++) {
            nums[index++] = key;
        }
    }

    return index;

    
};