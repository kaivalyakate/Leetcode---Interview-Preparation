a = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
max1 = a[0]
maxrr = a[0]

for i in range(1, len(a)):
    maxrr = max(a[i], maxrr + a[i])
    max1 = max(max1, maxrr)
print(max1)

# 3rd
# https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/528/week-1/3285/
