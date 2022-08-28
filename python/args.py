import time


def function1(*kaddu):
    for i in kaddu:
        print(i)
        time.sleep(0.5)


list1 = ["name", "hello", "pro", "max"]

function1(*list1)
