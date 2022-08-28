print("Enter the number : ")
number = int(input())

one = int(input("Enter the boolean number : "))
lol = bool(one)
if lol:
    for i in range(1, number + 1):
        print("* " * i)
else:
    for i in range(number, 0, -1):
        print("* " * i)
