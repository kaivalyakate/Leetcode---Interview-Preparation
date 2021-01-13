t = int(input())
maxans = []
while t!=0:
    nk = list(map(int, input().split()))
    n1 = list(map(int, input().split()))
    ans = []
    for i in range(0, len(n1)):
        if i<=len(n1)-nk[1]:
            ans.append(max(n1[i:i+nk[1]]))
    maxans.append(ans)
    t-=1
for i in maxans:
    print(i)