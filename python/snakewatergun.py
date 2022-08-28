import random

options = ("Snake", "Water", "Gun")

won = 0
loss = 0
draw = 0


def check():
    global won, loss, draw
    for i in range(0, 11):
        choice = random.choice(options)
        print("Enter your choice from (snake, water gun)",
              "\nPress a for snake, Press s for water, Press d for gun")

        USER = input()
        if USER == "s" and choice == "Water":
            print("Draw!")
            draw += 1
            continue
        if USER == "a" and choice == "Snake":
            print("Draw!")
            draw += 1
            continue
        if USER == "d" and choice == "Gun":
            print("Draw!")
            draw += 1
            continue
        if USER == "a" and choice == "Water":
            print("You won! the opponent's answer was :", choice)
            won += 1
        elif USER == "s" and choice == "Gun":
            print("You won! the opponent's answer was :", choice)
            won += 1
        elif USER == "d" and choice == "Snake":
            print("You won! the opponent's answer was :", choice)
            won += 1
        else:
            print("You loose, the opponent's answer was :", choice)
            loss += 1
        print()


check()
if won >= loss:
    print(f"You're the final winner your score is {won}, opponent's score is {loss} and the draws are {draw}")
else:
    print(f"You're the final looser your score is {won}, opponent's score is {loss} and the draws are {draw}")