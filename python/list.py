mylist=["kaddu", "harpic", "deodrant", "matchbox", "lighter", "gas",
        "harpic", 100]
kaddu="vegetable "
numbers=[1, 2, 4, 1, 6, 3, 9, 3, 5, 6, 4, 7, 9, 3, 2, 1, 6, 7, 40, 4, 3]

# numbers.sort() # orders numbers in ascending order
# print(numbers)
# numbers.reverse() # orders numbers in descending order

# print(len(numbers))
# print(numbers)

# numbers.append(5)

# numbers.append(8)
# numbers.append(9)
# print(numbers[0:5:])
# numbers.insert(3, 699)

"""
this edits the list and adds numbers in index accordingly 
example: this adds 699 in 3rd index
"""
numbers = [1, 4, 2, 8, 2, 5]
numbers[2] = 3
tp = (1, 4, 5)
# tp[1] = 4 # this gonna give error because tuple doesn't supports amend
print(tp)

a = 4
b = 5

# temp = a
# a = b
# b = temp
a ,b = b ,a # this swaps the numbers
print(a,b)