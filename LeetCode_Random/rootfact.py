def check_perf(n):
    divs = []
    for i in range(2, int(math.sqrt(n))+1):
        if n%i==0:
            divs.append(i)
            if i!=n//i:
                divs.append(n//i)
    if n==sum(divs):
        return 1
    else:
        return 0

import math
n = int(input())
cnt = 0
for i in range(5000, 9000):
    if check_perf(i):
        cnt+=1 
print(cnt)