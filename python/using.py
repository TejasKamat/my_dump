import random

lst = [12, 2, 34, 42, 4345, 5634, 63, 11, 5, 6]

for sequence in range(1, 69+1):
    choice = random.choice(lst)
    print(sequence, "'th Random number =", choice)

while True:
    numbers_random = random.randint(1, 69) * 100
    print(numbers_random)