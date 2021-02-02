from operator import itemgetter


def engineeringCutoff(n, marks):
    studs = {}
    for i in range(0, len(marks)):
        if min(marks[i][1:]) >= 35:
            studs[marks[i][0]] = [sum(marks[i][:]), sum(marks[i][1:4])]
    studs = dict(sorted(studs.items(), key=lambda item: (
        item[1][1], item[1][0], item[0]), reverse=True))
    return list(studs.keys())


n = int(input())
marks = []
for i in range(n):
    marks.append(list(map(int, input().split())))
result = engineeringCutoff(n, marks)
print(result)
