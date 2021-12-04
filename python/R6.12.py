from random import * 

# a.

values = []

for i in range(10) :
    values.append(randint(1,100))


values.sort(reverse=True)
print(values)

print()

# b. 
 
print("AND".join(map(str, values)))

print()

# c. 

values = [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
limit = 50
result = []
counter = 0
for element in values :
    if (element < limit) :
        counter += 1
print(values)
print(counter)

print()

# d.

values = [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
i = 0
limit = 50
while i < len(values) :
    if (values[i] < limit) :
        values.pop(i)
    else :
        i = i + 1
print(values)

print()

# e.
values = [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
temp = []
limit = 50
i = 0

while i < len(values) :
    if (values[i] < limit) :
        temp.append(values[i])
        values.pop(i)
    else :
        i = i + 1
print(temp)
print(values)


