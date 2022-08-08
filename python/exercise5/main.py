names = ["harry", "rohan", "hammad"]
data = ["exercise", "diet"]


def time():
    import datetime
    return datetime.datetime.now()


print("Enter name of client accordingly", names)
name_of_client = input("name of client : ")
print("You entered", name_of_client)

while name_of_client not in names:
    print("\nYou entered incorrect input, please try again", "\nEnter name of client accordingly", names)
    name_of_client = input("name of client : ")
    print("You entered", name_of_client)

print("\nEnter the the type of data you want to log", data)
name_of_data = input("Type of data : ")
print("You entered", name_of_data)

while name_of_data not in data:
    print("\nYou entered incorrect input, please try again", "\nEnter the the type of data you want to log", data)
    name_of_data = input("Type of data : ")
    print("You entered", name_of_data)

if name_of_client == "rohan" and name_of_data == "exercise":
    re = input("Enter the exercise time in minutes : ")
    with open("exercise/rohan_exercise.txt", "a") as rohan_exercise:
        rohan_exercise.write("\n \ndatetime : " + str(time()) + "\n \ttime of exercise in minutes : " + re + "Minutes")

if name_of_client == "rohan" and name_of_data == "diet":
    rd = input("Enter the meal : ")
    with open("diet/rohan_diet.txt", "a") as rohan_diet:
        rohan_diet.write("\n \ndatetime : " + str(time()) + "\n \tmeal : " + rd)

if name_of_client == "harry" and name_of_data == "exercise":
    he = input("Enter the exercise time in minutes : ")
    with open("exercise/harry_exercise.txt", "a") as harry_exercise:
        harry_exercise.write("\n \ndatetime : " + str(time()) + "\n \ttime of exercise in minutes : " + he + "Minutes")

if name_of_client == "harry" and name_of_data == "diet":
    hd = input("Enter the meal : ")
    with open("diet/harry_diet.txt", "a") as rohan_diet:
        rohan_diet.write("\n \ndatetime : " + str(time()) + "\n \tmeal : " + hd)

if name_of_client == "hammad" and name_of_data == "exercise":
    hae = input("Enter the exercise time in minutes : ")
    with open("exercise/hammad_exercise.txt", "a") as hammad_exercise:
        hammad_exercise.write(
            "\n \ndatetime : " + str(time()) + "\n \ttime of exercise in minutes : " + hae + "Minutes")

if name_of_client == "hammad" and name_of_data == "diet":
    had = input("Enter the meal : ")
    with open("diet/hammad_diet.txt", "a") as harry_diet:
        rohan_diet.write("\n \ndatetime : " + str(time()) + "\n \tmeal : " + had)
