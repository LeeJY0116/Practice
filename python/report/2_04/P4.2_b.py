# 정수 시퀀스를 읽어서 다음을 출력하는 프로그램을 작성하라.
# b. 짝수 입력 및 홀수 입력의 수

during = int(input("몇 번 입력하시겠습니까? : "))
ODD = 0
EVEN = 0

# 짝수와 홀수의 수를 저장할 변수를 선언하고, for문의 반복 횟수를 입력받습니다. 

for i in range(during)  :
    inputNumber = int(input("정수를 입력하세요 : "))
    if inputNumber % 2 == 0 :
        EVEN = EVEN + 1
    else :
        ODD = ODD + 1

# 조건문을 이용하여 몫이 0으로 떨어진다면, 짝수 그렇지 않다면 홀수가 증가합니다.

print("짝수는",EVEN,end="번 입력되었습니다.\n")
print("홀수는",ODD,end="번 입력되었습니다.")