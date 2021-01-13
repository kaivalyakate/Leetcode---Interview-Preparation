t = int(input())
ans = []
while t!=0:
    n = int(input())
    n1 = list(map(int, input().split()))
    ans1 = []
    for i in range(0, len(n1)):
        if len(n1[i+1:])>=1 and max(n1[i+1:])>n1[i] and max(n1[i+1:]) not in ans1:
            ans1.append(max(n1[i+1:]))
    ans1.append(n1[-1])
    ans.append(ans1)
    t-=1
for i in ans:
    for j in i:
        print(j, end=' ')
    print()