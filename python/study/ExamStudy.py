from random import * 

a = [("World")]
a.append(list("Hello"))

print(a)

b = a[ : ]
c = a
d = list(a)

print(b)
print(c)
#a.append(randint(1,100))
a.pop(0)
d.append("Hi")
d.append(0)
d.append(1)
d.append(2)
d.append(3)

print(b)
print(c)
print(d)
print(a)

if "World" in d :

    e = d.index("World")
else :
    e = -1
print(e)

print(a == d)

print(d[3:6])

f = "Hello Mistery My YesterDay"
result =""
for element in f :
    result = result + element
    print(result)

g = []

i = 0
while i < 10 :
    g.append(randint(0,100))
    i = i + 1
for i in range(len(g)) :
    if i > 0 :
        print(" | ", end = "")
    print(g[i], end="")
print()

limit = 199
pos = 0
found = False
h = []
i = 0
while i < 20 :
    h.append(randint(0,200))
    i = i + 1

while pos < len(h) and not found :
    if h[pos] > limit :
        found = True
    else :
        pos = pos + 1
if found :
    print(h)
    print(pos)
    print(h[pos])
else :
    print("not Found")

i = 0
limit = 200
while i < len(h) :
    if limit > h[i] :
        h.pop(i)
        print(h)
    else :
        i = i + 1
print(h)

print()

#i = 0
j = []
while i < 20 :
    j.append(randint(0,200))
    i = i + 1

i = 0
limit = 100
temp = []
while i < len(j) :
    if limit > j[i] :
        print(j)
        temp.append(j[i])
        j.pop(i)
        print(temp)
    else :    
        i = i + 1

j.sort()
temp.sort()
print(j)
print(temp)



def readDate() :
    print("Enter a date:")
    month = int(input(" month: " ))
    day = int(input(" day: " ))
    year = int(input(" year: " ))
    print(month, day, year)
    return (month, day, year)

date = readDate()
print(date)
(month, day, year) = readDate()

a = int(input("정수를 입력하세요"))
b = int(input("정수를 입력하세요"))

print("Sum : %12d" % (a+b))
print("Difference : %5d" % (a - b))
print("Product : %8d" % (a*b))
print("Average : %11.2f" % ((a+b) / 2))
print("Distance : %7d" % abs(a-b))
print("Maximum : %8d" % max(a,b))
print("Minimum : %8d" % min(a,b))

a = int(input("1,000에서 999,999 사이의 정수를 입력하세요"))

print(format(a, ","))

total = 0.0
a = input("성을 입력하세요")
b = input("이름을 입력하세요")
c = float(input("점수를 입력하세요, 종료를 원한다면 -1을 입력하세요"))

while c != -1 :
    d = a + b
    value = c
    total = total + value
    c = float(input("점수를 입력하세요, 종료를 원한다면 -1을 입력하세요"))

print(d, "님의 총합 점수는 " , total ," 입니다.")


a = input("단어를 입력하세요")
c = ''
for char in a :
    c = char + c
    
print(c)
print(''.join(reversed(a)))
print(a[::-1])


for i in range(len(a)) :
    for j in range(len(a) - i) :
        print(a[j:j + i + 1])
