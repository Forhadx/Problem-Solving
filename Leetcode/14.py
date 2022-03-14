# 14. Longest Common Prefix
class Solution:
    def diStringMatch(self, s) :
        ans = []
        j = 0
        k = len(s)

        for i in range(len(s)):
            if s[i] == "I":
                ans.append(j)
                j += 1        

            if s[i] == "D":
                ans.append(k)
                k -= 1
        ans.append(j)
        return ans
            
        

s = Solution()

x = s.diStringMatch("IDID")
print(x)