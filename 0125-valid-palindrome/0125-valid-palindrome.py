class Solution:
    def isPalindrome(self, s: str) -> bool:

        if len(s) == 0:
            return True

        s = ''.join(c.lower() for c in s if c.isalnum())
        y = s

        start , end = 0, len(s)-1

        while start < end:

            if s[start]!=s[end]:
                return False

            else:
                start +=1
                end -=1


        return True




            

        
        