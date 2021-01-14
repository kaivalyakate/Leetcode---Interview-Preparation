import collections
strs = ["", ""]
ans = collections.defaultdict(list)
for s in strs:
    ans[tuple(sorted(s))].append(s)
print(ans.values())
