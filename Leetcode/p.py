class Solution:
    def countEven(self, num: int) -> int:
        i = 2
        arr = []
        while i <= num:
            s = str(i)
            j = 0
            add = 0
            while j < len(s):    
                add += int(s[j])
                j += 1
            if add % 2 == 0:
                arr.append(add)
            i += 1
        return len(arr)

s = Solution()

print(s.countEven(30))