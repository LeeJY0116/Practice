# 루프를 이용하여 다음을 계산하는 프로그램을 작성하라.
# b. 1과 100사이(경계 포함)에 있는 모든 제곱수의 합

import math

START_NUM = 1
TWO = 2
FINISH_NUM = 100
result = 0
ROOT = int(math.sqrt(FINISH_NUM))

# 시작지점과 마지막지점 그리고 제곱을 하기 위한 상수 2와 결과값을 저장할 result 변수를 선언해줍니다.
# math.sqrt 함수를 사용하여, 마지막 지점의 제곱근을 구해주고 소수점은 버립니다.

for START_NUM in range(ROOT + 1) :
    result = result + (START_NUM ** TWO)

# 그 뒤에 시작지점부터 마지막 지점의 제곱근까지 1씩 늘어나는 for 루프문을 사용하여 계속해서 제곱을 해주고 결과값에 저장해줍니다.

print(result)