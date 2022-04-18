# 1 Two Sum

class Solution:
    def twoSum(self, nums, target):
        arr = []
        for i in range(len(nums)):
            if len(arr) > 0:
                for j in range(len(arr)):
                    print('arr:' ,arr)
                    if arr[j][0] == nums[i]:
                        return [arr[j][1], i]
               
            arr.append([target-nums[i], i])

        

s = Solution()

x = s.twoSum([3, 2, 5, 6, 8, 4, 7], 12)
print(x)