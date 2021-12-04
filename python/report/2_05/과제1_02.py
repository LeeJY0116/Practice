# P6.6 - P6.6 문제를 함수를 사용하지 말고 프로그래밍
# P 6.6 하나의 루프를 이용해 리스트의 합을 최솟값만 빼고 구하는 함수 sumWithoutSmallest를 작성하라.
# 루프 안에서 합과 최솟값을 갱신하고 루프 반복이 끝나면 합에서 최솟값을 뺀 차를 반환하면 된다.
import random   # 리스트에 랜덤한 정수들로 채워주기 위해 random 모듈을 import합니다.


numList = random.sample(range(1,999),10)    # 1부터 999까지의 랜덤한 정수 10개로 리스트를 초기화합니다.
minNum = 0
first = True
result = 0

# 첫 번째 값을 최솟값 변수에 넣고 그 값과 비교하기 위해 boolean 변수를 선언합니다.

for i in range(len(numList)):   # 리스트의 길이만큼 반복하는 for문을 선언합니다.
    if first == True :
        minNum = numList[i]
        first = False           # 첫 번째 인덱스의 값을 minNum에 대입합니다.
    if minNum > numList[i] :    # minNum보다 numList[i]의 값이 작다면 minNum에 대입합니다. 
        minNum = numList[i]
    result = result + numList[i]    # result값에 모든 인덱스의 합을 저장합니다.

print("최솟값을 제외한 리스트의 합은", result - minNum, "입니다.")  # 모든 인덱스의 합에서 최솟값을 뺀 뒤 출력합니다.