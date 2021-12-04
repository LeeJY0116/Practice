# 정수 시퀀스를 읽어서 다음을 출력하는 프로그램을 작성하라.
# a. 입력 중 가장 큰 수와 가장 작은 수

during = int(input("몇 번 입력하시겠습니까? : "))
maxNumber = 0
minNumber = 0
first = True

# for문의 반복 횟수를 during변수로 입력받습니다.
# 가장 큰 수와 가장 작은 수를 저장할 변수를 만들고, 최초 1회 값을 넣어주기 위해 Boolean 변수를 하나 선언해줍니다.

for i in range(during) :
    inputNumber = int(input("정수를 입력하세요 : "))
    if first == True :
        maxNumber = inputNumber
        minNumber = inputNumber
        first = False

# 최초에 입력받은 수를 가장 큰 수와 가장 작은 수에 모두 입력하는 조건문입니다.

    if inputNumber > maxNumber :
        maxNumber = inputNumber
    elif inputNumber < minNumber :
        minNumber = inputNumber

# 현재 입력받은 수가 최초에 입력받은 가장 큰 수보다 크다면, maxNumber에 새로 현재의 inputNumber를 입력합니다.
# 그렇지 않고 최초에 입력받은 가장 작은 수보다 작다면, minNumber에 현재의 inputNumber를 입력합니다.

print("입력 받은 값중 가장 큰 값은",maxNumber, end="입니다.\n")
print("입력 받은 값중 가장 작은 값은",minNumber, end="입니다.")
        