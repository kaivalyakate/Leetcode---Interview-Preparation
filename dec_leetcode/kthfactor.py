import math
n = int(input())
i = 1
ans = []
while(i <= int(math.sqrt(n))):
    if(n % i == 0):
        ans.append(i)
        if(int(n/i) != i):
            ans.append(int(n/i))
    i += 1
print(sorted(ans)[0])
