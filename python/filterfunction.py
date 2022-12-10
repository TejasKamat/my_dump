import subprocess
from functools import reduce

l1 = list(range(1, 15 + 1))


# with open("filterfunction.py", "a") as lol:
#     lol.write(f"\n{l1}")

# ==================================== FILTER ============================


def __greater__check__(num):
    return 5 < num


is_gr = list(filter(__greater__check__, l1))
# print(is_gr)

# ============================ reduce ======================

list1 = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]
print(reduce(lambda x, y: y + y, list1))
#
# for i in subprocess.run([ls]):
#     print(i)
name = ls
# list_files = subprocess.run(["ping", "google.com"])
# print(list_files.returncode)
# print(subprocess.run('cd ..').returncode)


print(subprocess.run(['sudo', 'pacman', '-S', name]).returncode)
