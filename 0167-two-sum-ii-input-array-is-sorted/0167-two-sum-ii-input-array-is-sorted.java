class Solution {
    int find(int nums[], int target, int l, int r) {
        while(l <= r) {
            int mid = l + (r -l)/2;
            if(nums[mid] == target)
                return mid;
            if(nums[mid] < target)
                l = mid+1;
            else r = mid -1;
        }
        return -1;
    }
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for(int i = 0; i < n; i++) {
            int idx = find(nums, target-nums[i], i+1,  n-1);
            if(idx != -1) return new int[] {i+1, idx+1};
        }
        return new int[]{-1, -1};
    }
}
 

