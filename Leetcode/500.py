# 500. Keyboard Row

class Solution:
    def findWords(self, words):
        row1 = 'qwertyuiop'
        row2 = 'asdfghjkl'
        row3 = 'zxcvbnm'

        ans = []

        for s in range(len(words)):
            val = words[s].lower()
            r1 = 0
            r2 = 0
            r3 = 0

            for i in range(len(val)):
                if  row1.find(val[i]) != -1:
                    r1 += 1
                if  row2.find(val[i]) != -1:
                    r2 += 1
                if  row3.find(val[i]) != -1:
                    r3 += 1
                
            if r1 == len(val) or r2 == len(val) or r3 == len(val):
                    ans.append(words[s])
        return ans

        

s = Solution()

s.findWords( ["Hello","Alaska","Dad","Peace"])