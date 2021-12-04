# 부동-소수점 숫자들을 읽는 프로그램을 작성하라. 프로그램은 사용자에게 값을 입력하도록 요청해야 하며, 다음을 출력한다.
# c. 가장 큰 값

during = int(input("몇 번 입력하시겠습니까? : "))
maxNumber = 0
first = True

# during변수에 for문의 반복 횟수를 사용자에게 입력받습니다.
# 최댓값을 구해 저장할 maxNumber 변수를 선언하고 최초 1회만 실행할 루프문을 위해 boolean변수 first를 선언합니다.

for i in range(during):
    inputNumber = float(input("실수를 입력하세요 : "))
    if first == True :
        maxNumber = inputNumber
        first = False

# first 변수를 이용하여 최초값을 최댓값을 저장할 변수에 넣어줍니다.

    if maxNumber < inputNumber :
        maxNumber = inputNumber

# 그 뒤에 계속하여 비교해서 최댓값을 산출해냅니다.

print("최댓값은", maxNumber , end="입니다.")