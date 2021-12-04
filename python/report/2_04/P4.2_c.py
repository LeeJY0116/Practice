# 정수 시퀀스를 읽어서 다음을 출력하는 프로그램을 작성하라.
# c. 누적 합계. 예를 들면 입력이 1 7 2 9일 때 프로그램은 1 8 10 19를 출력한다.

inputNumber = input("정수를 입력하세요 : ")
result = 0

for i in inputNumber :
    result = result + int(i)
    print(result, end=" ")

# 변수의 모든 인덱스를 대입하는 for 루프문을 활용하여 inputNumber의 모든 인덱스 값을 더해주며 결과값을 즉시 출력합니다.