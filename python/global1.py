l = 10


def function(n):
    global l
    l = 5
    m = 8

    l += 45
    print(l, m)
    print(n, "I've printed this")


function(23)
