# 부동-소수점 숫자들을 읽는 프로그램을 작성하라. 프로그램은 사용자에게 값을 입력하도록 요청해야 하며, 다음을 출력한다.
# d. 범위, 즉 최댓값과 최솟값의 차이

during = int(input("몇 번 입력하시겠습니까? : "))
first = True
minNumber = 0
maxNumber = 0
result = 0

# during변수에 for문의 반복 횟수를 사용자에게 입력받습니다.
# 최댓값을 구해 저장할 maxNumber 변수와 최솟값을 구해 저장할 minNumber, 
# 그리고 최종 결과값을 저장할 result 변수를 선언하고 최초 1회만 실행할 루프문을 위해 boolean변수 first를 선언합니다.

for i in range(during):
    inputNumber = float(input("실수를 입력하세요 : "))
    if first == True :
        minNumber = inputNumber
        maxNumber = inputNumber
        first = False

# first 변수를 활용하여, 최초값을 최댓값과 최솟값에 각각 입력해줍니다.

    if minNumber > inputNumber :
        minNumber = inputNumber
    elif maxNumber < inputNumber :
        maxNumber = inputNumber

# 그 뒤에 계속해서 비교하며, 최솟값과 최댓값을 산출해냅니다.

result = maxNumber - minNumber

# 마지막으로 result변수에 최댓값과 최솟값의 차이를 연산하여 입력해줍니다.

print("이 부동소수점의 범위는" , result , end="입니다.")