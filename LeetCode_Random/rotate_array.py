arr = list(map(int, input().split()))
k = int(input())
if k==0:
    print(arr)
else:
    arr[:] = arr[len(arr)-k:]+arr[:len(arr)-k]
print(arr)