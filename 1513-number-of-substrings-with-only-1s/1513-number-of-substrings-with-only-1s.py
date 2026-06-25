class Solution(object):
    def numSub(self, s):
        mod = 10**9 + 7
        count = 0
        ans = 0

        for i in s:
            if i == '1':
                count += 1
                ans += count
            else:
                count = 0

        return ans % mod           
               


        