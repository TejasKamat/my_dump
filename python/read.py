file = open("kaddu/kaddu.txt",
            "rt")
# con = file.read()

print(file.readlines()) # to print stuffs in list

print(file.readline())
file.seek(11)
"""to skip lines and some characters"""
print(file.tell())
print(file.readline())