class Solution:
    def isPalindrome(self, s: str) -> bool:

        if len(s)== 0:
            return True
        
        last = len(s) - 1
        start = 0

        s = s.lower()
        s = ''.join(c for c in s if c.isalnum())

        last = len(s) - 1
        start = 0

        while start < last:
            if s[start] != s[last]:
                return False

            else:
                start +=1
                last-= 1


        return True
         

        
            