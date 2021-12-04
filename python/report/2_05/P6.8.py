# P6.8 리스트의 모든 원소에 대해 교대합을 구하라. 예를 들어 프로그램이 다음 입력을 읽어들이면 다음과 같이 계산해야 한다.
# 1 4 9 16 9 7 4 9 11
# 1 - 4 + 9 - 16 + 9 - 7 + 4 - 9 + 11 = -2

import random   # 리스트에 랜덤한 정수들로 채워주기 위해 random 모듈을 import합니다.

result = 0
numberList = [1, 4, 9, 16, 9, 7, 4, 9, 11] # 예시의 리스트를 리스트로 선언합니다.

for i in range(len(numberList)) :
    if(i % 2 == 0) :                        # 리스트의 인덱스가 짝수라면 덧셈, 홀수라면 뺄셈을 하는 조건문입니다.
       result = result + numberList[i]
       print(" +" , numberList[i], end="")
    else :
       result = result - numberList[i]
       print(" -" ,numberList[i], end="")   # 반복문을 반복하며 연산식을 출력해줍니다.
print(end=" = ")
print(result)                               # 연산식과 최종 결괏값을 출력합니다.
