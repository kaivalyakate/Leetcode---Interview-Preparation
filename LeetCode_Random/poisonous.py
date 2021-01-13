#n = int(input())
a = list(map(int, input().split()))
stk = [a[0]]
cnt = 0
if len(a)==1:
    cnt = 1
else:
    while True:
        for i in range(1, len(a)):
            if a[i]<=a[i-1]:
                stk.append(a[i])
        if len(a)==len(stk) or len(a)<=1:
            break
        cnt+=1
        a = stk
        stk = [a[0]]
print(cnt)
