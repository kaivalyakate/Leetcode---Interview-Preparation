t = int(input())
ans = []
while t!=0:
    n = int(input())
    a1 = sorted(list(map(int, input().split())))
    b1 = sorted(list(map(int, input().split())))
    moves = 0
    for i in range(1, len(a1)):
        moves += (a1[i]-a1[0])
        moves += (b1[i]-b1[0])
    ans.append(moves)
    t-=1
print(ans)