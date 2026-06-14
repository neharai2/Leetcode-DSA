class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:

        freq = {}

        for s in strs:
            sorted_string = ''.join(sorted(s))

            if sorted_string in freq:
                freq[sorted_string].append(s)

            else:
                freq[sorted_string] = [s]

            


        return list(freq.values())

        