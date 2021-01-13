n = 2
j = 0
while n != 1:
    ans = 0
    for i in list(str(n)):
        ans += int(i)**2
    if ans == 1:
        break
    if j == 10:
        break
    n = ans
    j += 1
    print(n, j)

# 2nd 
# https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/528/week-1/3284/
