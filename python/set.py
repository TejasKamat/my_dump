s = set()
# print(type(s))

s.add(1)
s.add(4)
s.add(3)
s.add(9)
print(s)
s.remove(9)
s1 = s.intersection({1, 2, 4, 3, 5})
print(s, s1)
