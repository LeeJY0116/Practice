#a.

values = []

values.extend([1, 2, 3, 4, 5, 6, 7, 8, 9, 10])

print(values)

print()

#b.

values = []

for i in range(21) :
    if i % 2 == 0 :
        values += [i]

print(values)

print()

#c.

values = []

for i in range(1,11) :
    values.append(i*i)

print(values)

print()

#d.

values = []

values = [0] * 10

print(values)

print()

#e.

values = []

values.extend([1, 4, 9, 16, 9, 7, 4, 9, 11])

print(values)

print()

#f.

values = []

for i in range(5) :
    values.append(0)
    values.append(1)

print(values)

print()

#g.

values = []

for i in range(2) :
    for j in range(5) :
        values += [j]

print(values)