# 1828. Queries on Number of Points Inside a Circle


import math
class Solution:
    def countPoints(self, points, queries):
        ans = []
        for q in range(len(queries)):
            l = 0
            for p in range(len(points)):
                d = math.sqrt(pow(abs(points[p][0] - queries[q][0]), 2) + pow(abs(points[p][1] - queries[q][1]), 2))
                if d <= queries[q][2]:
                    l = l + 1
            ans.append(l)
        print(ans)

s = Solution()


s.countPoints([[1,1],[2,2],[3,3],[4,4],[5,5]], [[1,2,2],[2,2,2],[4,3,2],[4,3,3]])


'''
Euclidean Distance Formula

    d =√[(x2 – x1)2 + (y2 – y1)2]

    d <= radius , then true

'''