""" QUESTION: write a program which gives a user 9 chances to play in which he/she should guess and enter a number.
The real number will be 12 and also give them some tips with using terms like "Entered a greater number, try again
with a smaller one" """
i=9
guess = 12
while i < 10:
    if i == 0:
        break
    print("Guess the correct number, Your chances are: ", i)
    num = int(input("Enter the number: "))
    if num == 12 and i > 6:
        print("WHAO!!, you've entered the correct number within 3 chances, youre a pro.\n")
        break
    elif num == 12:
        print("WHAO!!, you've entered the correct number.\n")
        break
    elif num > 20:
        print("Ops, you entered a greater number.\n")
    elif num > 30:
        print("Lmao, you entered much greater number, try again with a smaller ones.\n")
    elif num < 8:
        print("You entered a smaller number.\n")
    elif num < 5:
        print("You entered a much smaller number, try again with a greater ones.\n")
    elif i == 0:
        print("GAME OVER!!")
    i -= 1
