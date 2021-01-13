hay = input()
needle = input()
for i in range(0, len(hay)):
    if i+len(needle)<=len(hay) and hay[i:i+len(needle)]==needle:
        print(i)
        break