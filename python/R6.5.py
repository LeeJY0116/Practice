from random import *

values = []

for i in range(10) :
    values += [randint(1,100)]

print(values)

print()

values = []
number = randint(1, 100)

for i in range(10) :
    while number in values :
        number = randint(1,100)
    values.append(number)

print(values)

