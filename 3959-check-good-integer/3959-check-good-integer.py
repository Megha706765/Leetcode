class Solution(object):
    def checkGoodInteger(self, n):
        digitsum = 0
        squaresum = 0
        while(n > 0):
            rem = n % 10
            digitsum += rem
            squaresum += rem * rem
            n //= 10
        total = squaresum - digitsum
        return total >= 50        

        
        