# 1877. Minimize Maximum Pair Sum in Array


class Solution:
    def minPairSum(self, nums):
        nums.sort()

        arr = []
        i = 0
        while i < len(nums)/2:
            arr.append(nums[i]+nums[len(nums)-1-i])
            i += 1
        return max(arr)

s = Solution()

s.minPairSum([3,5,4,2,4,6])
