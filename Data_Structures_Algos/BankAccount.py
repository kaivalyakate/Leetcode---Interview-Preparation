n = int(input())
a = [int(x) for x in input().split()]
count = 0
for i in range(0, len(a)):
    if a[i] < 0:
        count += 1
print(count)
