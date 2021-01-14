nums = [0, 0, 3, 0, 12, 0, 1, 2]
i, j = 0, len(nums)
while (i <= j and i < len(nums)):
    if nums[i] == 0:
        nums.append(0)
        nums.pop(i)
        j -= 1
    else:
        i += 1
print(nums)
# https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/528/week-1/3286/
