asc = list("!#$%&\'()*+,-./:;?@[\\]^_`{|}~ \t\n\r\x0b\x0c")
print(asc)
s = "Marge, let's \"[went].\" I await {news} telegram."
if len(s)==0:
        print(True)
print(''.join(i for i in list(filter(str.isalnum, s.lower())))[::-1], ''.join(i for i in list(filter(str.isalnum, s.lower()))))