class Solution:
    def findDuplicate(self, nums: List[int]) -> int:

        new = set()
        i = 0

        while i < len(nums):
            if nums[i] not in new:
                new.add(nums[i])
            else:
                return nums[i]

            i = i+1


          

        