# 942. DI String Match

class Solution:
    def longestCommonPrefix(self, strs) :
        ans = ''
        for i in range(len(strs[0])):
            for j in range(len(strs)):
                if len(strs[j]) <= i :
                    return ans 
                if strs[0][i] != strs[j][i]:
                    return ans 
            ans += strs[0][i]     
        return ans
        

s = Solution()

x = s.longestCommonPrefix( ["av","a"])
print(x)