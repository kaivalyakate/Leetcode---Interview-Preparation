arr = [8, 8, 2, 4, 5, 5, 1]
i = 1
max1 = arr[0]
rain = 0
tp = 0
while i < len(arr):
    if arr[i] < max1:
        tp += (max1-arr[i])
    elif arr[i] >= max1:
        max1 = arr[i]
        rain += tp
        tp = 0
    i += 1
print(rain)
