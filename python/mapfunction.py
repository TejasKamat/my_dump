num = ["2", "3", "32", "90"]

for i in range(len(num)):
    num[i] = int(num[i])


# lol = num[2] * num[2]
# print(lol, 32 * 32)
# print(list(map(square, num)))

def square(a):
    return a * a


def cube(a):
    return a * a * a


ll = (square, cube)

for i in range(len(num) + 2):
    print(list(map(lambda x: x(i), ll)))
