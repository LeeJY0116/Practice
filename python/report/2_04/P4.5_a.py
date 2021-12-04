# 부동-소수점 숫자들을 읽는 프로그램을 작성하라. 프로그램은 사용자에게 값을 입력하도록 요청해야 하며, 다음을 출력한다.
# a. 값들의 평균

during = int(input("몇 번 입력하시겠습니까? : "))
result = 0

# 결과값을 저장할 result 변수를 선언하고 for문의 반복 횟수를 입력받습니다.

for i in range(during):
    inputNumber = float(input("실수를 입력하세요 : "))
    result = result + inputNumber

# 실수를 입력받고, 그 모든 실수를 result 변수에 더해줍니다.

result = result / during

# result값을 for문이 반복된 횟수만큼 나눠줍니다.

print("값들의 평균은",result,end="입니다.")