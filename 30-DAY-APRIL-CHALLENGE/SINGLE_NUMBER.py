from collections import Counter
arr1 = Counter(list(map(int, input().split())))
for i in arr1:
    if(arr1[i] == 1):
        print(i)

# First Problem of April Leetcode challenge
# Link to the Problem
# https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/528/week-1/3283/
