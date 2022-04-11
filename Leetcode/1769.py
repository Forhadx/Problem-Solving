# 1769. Minimum Number of Operations to Move All Balls to Each Box

class Solution:
 def minOperations(self, boxes):      
        ans = []

        for i in range(len(boxes)):
                k = 0
                for j in range(len(boxes)):
                        if boxes[j] == '1':
                                k += abs(i-j)
                ans.append(k)
        return ans

s = Solution()
x = s.minOperations("001011")
print(x)