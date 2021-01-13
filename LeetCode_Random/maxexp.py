import math
n1 = list(map(int, input().split()))
max1 = 0
for i in range(2, n1[1]+1):
    if math.log(i, 2)%1==0:
        if i>max1:
            max1 = i 
print(max1) 