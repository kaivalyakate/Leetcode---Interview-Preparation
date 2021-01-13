arr1 = list(map(int, input().split()))
i = 0
maxcnt, cnt = 0, 0
while i<len(arr1):
    if arr1[i]==1:
        cnt+=1
        if cnt>maxcnt:
            maxcnt = cnt
    elif arr1[i]==0:
        cnt = 0
    i+=1   
print(maxcnt)     