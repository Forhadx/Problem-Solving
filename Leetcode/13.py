# 13 Roman to Integer
class Solution:
    def romanToInt(self, s: str) -> int:
        i = 0
        dec = 0
        while i < len(s):
            if i+1 < len(s):
                if s[i] == 'I' and s[i+1] == 'V': 
                    dec += 4
                    i += 2
                    continue
                elif s[i] == 'I' and s[i+1] == 'X': 
                    dec += 9
                    i += 2
                    continue
                elif s[i] == 'X' and s[i+1] == 'L': 
                    dec += 40
                    i += 2
                    continue
                elif s[i] == 'X' and s[i+1] == 'C':
                    dec += 90
                    i += 2
                    continue
                elif s[i] == 'C' and s[i+1] == 'D':
                    dec += 400
                    i += 2
                    continue
                elif s[i] == 'C' and s[i+1] == 'M':
                    dec += 900
                    i += 2
                    continue
                

            if s[i] == 'I': dec += 1
            elif s[i] == 'V': dec += 5
            elif s[i] == 'X': dec += 10
            elif s[i] == 'L': dec += 50
            elif s[i] == 'C': dec += 100
            elif s[i] == 'D': dec += 500
            elif s[i] == 'M': dec += 1000
            i += 1

        return dec




s = Solution()
print(s.romanToInt('IIIV'))


