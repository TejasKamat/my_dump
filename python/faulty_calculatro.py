# Faulty calculator

operator = input("Input the operator: ")
num1 = int(input("Input the first number: "))
num2 = int(input("Input the second number: "))

if operator == "+":
    num = num1+num2
elif operator == "-":
    num = num1-num2
elif operator == "*":
    num = num1*num2
elif operator == "/":
    num = num1/num2
else:
    print("In valid Operator!!")

if operator == "*" and num1 == 45 and num2 == 3:
    print("Your answer is 555")
elif operator == "+" and num1 == 56 and num2 == 9:
    print("Your answer is 77")
elif operator == "/" and num1 == 56 and num2 == 6:
    print("Your answer is 4")
else:
    print("Your answer is ", num)