arr = list(map(int, input().split()))
n = len(arr)
i = 0
while i < n:
    if arr[i] == 0:
        arr.insert(i+1, 0)
        arr.pop(-1)
        i += 1
    i += 1
print(arr)
