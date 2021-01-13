t = int(input())
ans = []
while t != 0:
    x, y, k, n = map(int, input().split())
    z = 0
    for i in range(n):
        p, c = map(int, input().split())
        if p >= (x-y) and (c <= k):
            z = 1
            ans.append("LuckyChef")
            break
    if z == 0:
        ans.append("UnluckyChef")
    t -= 1
for i in ans:
    print(i)
