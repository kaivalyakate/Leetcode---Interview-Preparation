arr1 = input()
wrds = list(input().split())
wrds1 = ''.join(i for i in wrds)
wrds2 = ''.join(i for i in wrds[::-1])
ans = []
if len(wrds1)>len(arr1):
    print([])
elif len(wrds1)==len(arr1) and (wrds1==arr1 or wrds2==arr1):
    print([0])
else:
    for i in range(0, len(arr1)):
        if i+len(wrds1)<=len(arr1)-1:
            if arr1[i:i+len(wrds1)]==wrds1 or arr1[i:i+len(wrds2)]==wrds2:
                ans.append(i)
print(ans)
