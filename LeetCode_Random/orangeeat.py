def minoranges(n):
    dp = {}
    dp[0] = 0
    dp[1] = 1
    dp[2] = 2
    dp[3] = 2
    if n<4:
        return dp[n]
    for i in range(4, n+1):
        minops = 2*10^9
        if i%2==0:
            if dp[i//2]+1<minops:
                minops = dp[i-(i//2)]+1
        if i%3==0:
            if dp[i//3]+1<minops:
                minops = dp[i-2*(i//3)]+1
        if dp[i-1]+1<minops:
            minops = dp[i-1]+1
        dp[i] = minops
    return dp[n]

n = int(input())   
print(minoranges(n))