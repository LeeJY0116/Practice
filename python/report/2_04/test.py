
size = int(input(""))

for i in range(size):
    for j in range(size):
        print("*",end="")
    print()

for x in range(size):
    print("*",end="")
print("")
for y in range(size-1):
    print("*",end="")
    for i in range(size-2):
        print(" ",end="")
    print("*")
for x in range(size):
    print("*",end="")