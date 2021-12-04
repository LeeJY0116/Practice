table = []
width = 5
length = 7


for i in range(length) :
    leng = [0] * width
    table.append(leng)
print('\n'.join(map(str, table)))
print()

for i in range(length) :
    for j in range(width) :
        table[i][j] = 1
print('\n'.join(map(str, table)))
print()

for i in range(length) :
    for j in range(width) :
        if ( i % 2 != 0) :
            if ( j % 2 != 1 ) :
                table[i][j] = 1
            else :
                table[i][j] = 0
        else :
            if ( j % 2 != 1 ) :
                table[i][j] = 0
            else :
                table[i][j] = 1


for i in range(length) :
    for j in range(width) :
        table[0][j] = 0
        table[length -1][j] = 0
print('\n'.join(map(str, table)))
print()

for i in range(length) :
    for j in range(width) :
        table[i][0] = 1
        table[i][width-1] = 1
print('\n'.join(map(str, table)))
print()



sum = 0 ;

for i in range(length) :
    for j in range(width) :
        sum += table[i][j]


print('\n'.join(map(str, table)))
print()
print(sum)

