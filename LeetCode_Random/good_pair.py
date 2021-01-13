nums = list(map(int, input().split()))
prs = 0
dc1 = {}
for i in nums:
    if i in dc1:
        prs -= dc1[i]*(dc1[i]-1)//2
        dc1[i] += 1
        prs += dc1[i]*(dc1[i]-1)//2
    else:
        dc1[i] = 0
        dc1[i] += 1
print(prs)
