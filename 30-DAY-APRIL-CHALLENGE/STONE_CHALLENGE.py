stones = [2, 2, 2]
i = 0
while i < len(stones) or len(stones) >= 1:
    stones = sorted(stones, reverse=True)
    if(len(stones) == 1):
        print(stones[0])
        break
    if stones[i] == stones[i+1] and (i+1) < len(stones):
        stones[i] = stones[i+1] = 0
        stones.pop(i)
        stones.pop(i)
    elif stones[i] > stones[i+1] and (i+1) < len(stones):
        stones[i] -= stones[i+1]
        stones.pop(i+1)
print(stones)
