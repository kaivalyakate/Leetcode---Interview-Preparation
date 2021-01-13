nums = list(map(int, input().split()))
n = 4
res = []
i, j = 0, n
while i < n and j < len(nums):
    res.append(nums[i])
    res.append(nums[j])
    i += 1
    j += 1
print(res)
