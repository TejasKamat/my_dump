list1 = [ ["Harry", 4], ["Kaddu", 3], ["Marie", 5]]

# # print(type(list1))
# print(list1[2], list1[1], list1[0])
# for var in list1:
#     print(var)

dict1 = dict(list1)
# for items, numbers in dict1.items():
#     print(items, numbers)

# for item, num in dict1.items():
#     if num>4:
#         print(item, num)
#     elif num ==4:
#         print(num, "Its equal")

# quiz
list = ["KAAAddu", "lAssan", 34, 1, 4, 33, 45, 67, 54, "hello", "world"]
for item in list:
    if str(item).islower():
        print(item)