a = [3, 30, 34, 5, 9]
a = sorted(a, reverse=True, key=lambda x: int(str(x)[0]))
print(''.join(str(i) for i in a))
