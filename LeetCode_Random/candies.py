import collections
candyType = [1, 1, 2, 2, 3, 3]
diff = list(collections.Counter(candyType).keys())
if len(diff) <= len(candyType)//2:
    print(len(diff))
elif len(diff) > len(candyType)//2:
    print(len(candyType)//2)
