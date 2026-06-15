class Solution:
    def isPalindrome(self, x: int) -> bool:
        if x < 0:
            return False
        y = x
        new_num = 0

        while x > 0:
            new_num = (new_num*10) +  (x % 10)
            x = x//10

            
        if new_num == y:
            return True

        else:
            return False