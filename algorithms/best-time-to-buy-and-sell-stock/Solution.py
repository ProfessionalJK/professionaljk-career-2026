def max_profit(transactions):
    maxProfit = 0
    if len(transactions) == 0:
        return maxProfit
    for i in range(0, len(transactions)-1):
        for j in range(i+1, len(transactions)):
            profit = transactions[j] - transactions[i]
            if profit > 0 and maxProfit < profit:
                maxProfit = profit
    return maxProfit

print(max_profit([7, 1, 5, 3, 6, 4]))
print(max_profit([7, 6, 4, 3, 1]))
print(max_profit([2, 4, 1]))
print(max_profit([]))
print(max_profit([1, 2]))
print(max_profit([3, 3, 3]))