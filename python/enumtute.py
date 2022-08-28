l1 = ["item1", "item2", "item3", "item4"]

# i = 1
#
# for item in l1:
#     if i % 2 != 0:
#         print(item)
#     i += 1

for num, item in enumerate(l1):
    if num % 2 == 0:
        print(f"{item} {num}")
