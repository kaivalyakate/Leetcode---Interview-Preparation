prices = [7, 6, 4, 3, 1]
result = 0
for i in range(len(prices)-1):
    if prices[i+1] > prices[i]:
        result += prices[i+1] - prices[i]
print(result)

#
