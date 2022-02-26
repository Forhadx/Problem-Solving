# 9 Palindrome Number
import math

class Solution:
    def isPalindrome(self, x: int) -> bool:
        if x < 0:
            return False
        if x <= 9: 
            return True

        arr = []
        a = x
        while a >= 1:
            arr.insert(0, a%10)
            a = math.floor(a/10)

        n = len(arr) -1 
        i = 0
     
        while i < math.ceil(len(arr) / 2):
            if arr[i] == arr[n]:
                n -= 1
            else:
                return False
            i += 1

        return True