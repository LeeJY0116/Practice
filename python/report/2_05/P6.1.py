# P 6.1 리스트를 열 개의 랜덤 정수로 초기화하고 다음 내용대로 네 줄을 출력하는 프로그램을 작성하라.
# 짝수 인덱스의 모든 원소
# 모든 짝수 원소
# 역순으로 된 모든 원소
# 처음과 마지막 원소만

import random   # 랜덤 정수로 초기화하기 위해 random 모듈을 import 합니다.

numberList = random.sample(range(1,999),10) # 1부터 999까지의 랜덤한 정수 10개로 리스트를 초기화합니다.

print(numberList[1:len(numberList):2])   # 짝수 인덱스의 원소를 모두 출력합니다.

for i in numberList :
    if i % 2 == 0 :
        print(i, end=" ")
print()

# 위의 for문과 if문으로 모든 짝수 원소만을 출력합니다.

print(numberList[10::-1])   # 모든 원소를 역순으로 출력합니다.

for i in range(len(numberList)) :
    if i == 0 :
        print(numberList[i], end=" ")
    elif i == len(numberList)-1 :
        print(numberList[i])

# for문을 사용하지 않고 print문만을 두개 사용해서 손쉽게 만들 수 있지만, for문을 사용한다면 이런식으로 만들 수 있습니다.