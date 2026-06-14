class Solution:
    def isAnagram(self, s: str, t: str) -> bool:

        if len(s) != len(t):
            return False

        char1 = list(s)
        char1.sort()
        char2 = list(t)
        char2.sort()

        if char1 == char2:
            return True

        else:
            return False



        

        