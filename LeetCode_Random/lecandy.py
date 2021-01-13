t = int(input())
ans = []
while t != 0:
    nc = list(map(int, input().split()))
    ele = list(map(int, input().split()))
    cnt = 0
    for i in range(0, len(ele)):
        cnt += ele[i]
    if cnt <= nc[1]:
        ans.append("Yes")
    else:
        ans.append("No")
    t -= 1
for i in ans:
    print(i)
