# 부동-소수점 숫자들을 읽는 프로그램을 작성하라. 프로그램은 사용자에게 값을 입력하도록 요청해야 하며, 다음을 출력한다.
# b. 가장 작은 값

during = int(input("몇 번 입력하시겠습니까? : "))
minNumber = 0
first = True

# during변수에 for문의 반복 횟수를 사용자에게 입력받습니다.
# 최솟값을 구해 저장할 minNumber 변수를 선언하고 최초 1회만 실행할 루프문을 위해 boolean변수 first를 선언합니다.

for i in range(during):
    inputNumber = float(input("실수를 입력하세요 : "))
    if first == True :
        minNumber = inputNumber
        first = False

# first 변수를 이용하여 최초값을 최솟값에 넣어줍니다.

    if minNumber > inputNumber :
        minNumber = inputNumber

# 그 뒤에 계속해서 비교하여 최솟값을 구해줍니다.

print("최솟값은", minNumber, end="입니다.")
    