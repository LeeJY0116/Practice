l = []
a = 4
b = 5

for i in range(b) :
    c = [0] * a
    l.append(c)

for i in range(b) :
    for j in range(a) :
        if ( i % 2 != 0) :
            if ( j % 2 != 1 ) :
                l[i][j] = 1
            else :
                l[i][j] = 0
        else :
            if ( j % 2 != 1 ) :
                l[i][j] = 0
            else :
                l[i][j] = 1


print('\n'.join(map(str, l)))

sum = 0 ;

for i in range(b) :
    for j in range(a) :
        sum += l[i][j]

print(sum)