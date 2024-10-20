def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        minPrice = float('inf')
        profit = 0
        for i in range(0,len(prices)):
            if(minPrice > prices[i]):
                minPrice=prices[i]
            else:
                profit = max(prices[i]-minPrice, profit)
        return profit

print(maxProfit('', prices=[7,1,5,3,4,6,9]))