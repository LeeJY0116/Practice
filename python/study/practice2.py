
for i in range (3) :
    for n in range (4) :
        print("*", end="")
    print()


# 대문자 갯수 세기

string = input()
isupper = 0
for char in string :
    if char.isupper() :
        isupper += 1


# 모음 갯수 세기

print(isupper)

word = input()
moum = 0
for char in word :
    if char.lower() in "aeiou" :
        moum += 1
print(moum)


# 대문자만 출력하기

sentence = input()
for i in range(len(sentence)) :
    if sentence[i].isupper() :
        print(sentence[i], end="")
print()


# 숫자가 처음으로 나온 인덱스 출력하기 // 맨 처음부터 찾음

sentence = input()
found = False
position = 0
while not found and position < len(sentence) :
    if sentence[position].isdigit() :
        found = True
    else :
        position += 1

if found :
    print(position)
else :
    print("없음")

# 숫자가 처음으로 나온 인덱스 출력하기 // 맨 뒤에서부터 찾음

sentence = input()
found = False
position = len(sentence) - 1
while not found and position >= 0 :
    if sentence[position].isdigit() :
        found = True
    else :
        position -= 1

if found :
    print(position)
else :
    print("없음")


# 문자열 유효성 평가 ( 전화번호 )

sentence = input("전화번호를 입력하세요[(043)123 - 1234 형식으로] : " )

valid = len(string) == 13
position = 0

while valid and position < len(string) :
    if position == 0 :
        valid = string[position] == "("
    if position == 4 :
        valid = string[position] == ")"
    if position == 8 :
        valid = string[position] == "-"
    else :
        valid = string[position].isdigit()
position += 1

if valid :
    print("전화번호가 맞습니다.")
else :
    print("전화번호의 형식이 맞지 않습니다.")

# 전화번호를 입력하면 자동으로 괄호와 '-' 를 추가해줌

number = input("전화번호를 입력하세요 : (띄어쓰기 , - 없이) " )

count = 0

while count < len(number) :
    if count == 0 :
        print("(", end="")
    if count == 3 :
        print(")", end="")
    if count == 7 :
        print("-", end="")
    else :
        print(number[count], end="")
    count +=1
