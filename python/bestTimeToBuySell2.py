def maxProfit(self, prices):
    """
    :type prices: List[int]
    :rtype: int
    """
    profit = 0

    for i in range(1, len(prices)):
        # Si el precio del día actual es mayor que el del día anterior,
        # suma la diferencia al beneficio total
        if prices[i] > prices[i - 1]:
            profit += prices[i] - prices[i - 1]

    return profit

print(maxProfit('', prices=[6,1,3,2,4,7]))