#P4.6 다음은 입력 값들 중 최솟값을 찾는 의사코드이다. 파이썬으로 번역하라.


first = True
mininum = 0
value = 0.0
userinput = 0

# 처음 입력 받은 숫자를 최소값으로 넣어주는 first Bool 변수를 선언합니다.
# 최소값을 넣어줄 변수와, 최소값과 비교할 value 변수, input변수를 선언합니다.

while True :

# 중간에 공백이 입력되기 전까지 계속해서 입력받습니다.

    userinput = input("숫자를 입력하세요 공백을 입력하면 종료됩니다.")
    if userinput == "" :
        break

# 도중에 공백값이 입력되면 break문으로 무한루프를 빠져나옴으로써 결과값을 출력합니다.

    else:
        value = float(userinput)

# input의 자료형이 숫자 자료형이 아니기 때문에 float로 자료형변환을 해줍니다.

    if first == True :
        mininum = value
        first = False
    elif mininum > value :
        mininum = value

# first가 True라면 처음 들어온 숫자를 최소값으로 입력하고 first변수를 False로 바꿉니다.
# 그 뒤에 계속 들어오는 값과 기존의 최소값을 비교하며 최소값을 연산합니다.

print("최소값은" , mininum , end = "입니다.")

# 최소값을 출력해줍니다.