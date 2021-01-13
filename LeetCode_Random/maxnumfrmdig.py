n = list(map(int, list(input())))
i = len(n)-1
if i==1 and sorted(n, reverse=True)==n:
    print(sorted(n))
elif i>0:
    while i!=0:
        j = i-1
        while j>=0:
            if n[j]<n[i]:
                n[j], n[i] = n[i], n[j]
                if j+1<=len(n)-1:
                    n[j+1:] = sorted(n[j+1:])
                    j = -2
                break
            j-=1
        i -= 1
        if j==-2:
            break
        elif i==0 and j!=-2:
            print(sorted(n))
print(n)