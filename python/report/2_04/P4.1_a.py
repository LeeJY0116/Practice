# 루프를 이용하여 다음을 계산하는 프로그램을 작성하라.
# a. 2와 100 사이(경계 포함)에 있는 모든 짝수들의 합

START_NUM = 2
FINISH_NUM = 100
result = 0

# 시작지점이 될 상수 변수와 마지막지점이 될 상수 변수를 선언해주고, 결과값을 저장 할 변수도 선언해줍니다.

for START_NUM in range(START_NUM,FINISH_NUM + 1,2) :
    result = result + START_NUM

# 시작지점인 2에서부터 마지막지점인 101(100을 포함하기 위해서 + 1 해줍니다.) 까지 2씩 증가하는 for 루프문을 활용하여 짝수들만 더해줍니다. 

print(result)