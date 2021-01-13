arr = list(map(int, input().split()))
i, j = 0, 0
m, n = 3, 3
while i<len(arr) and j<len(arr):
    if arr[i]<arr[j]:
        i+=1
    elif arr[i]==arr[j]:
        for k in range(i+1, m+1):
            arr[i+1] = arr[i]
          