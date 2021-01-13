fb = list(map(int, input().split()))
n = int(input())
i = 0
while (n != 0) and (i < (len(fb)-1)):
    if(fb[i] == 1):
        if(i+2 == len(fb)-1):
            if(fb[i+1] == 0 and fb[i+2] == 0):
                fb[i+2] = 1
                n -= 1
                break
        i += 2
    elif(fb[i] == 0):
        if(fb[i+1] == 1):
            i += 1
        elif(fb[i+1] == 0):
            fb[i] = 1
            n -= 1
if(n == 0):
    print(True)
else:
    print(False)
