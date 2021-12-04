# P 6.7 min 함수 또는 remove 메소드를 사용하지 말고 리스트에서 최솟값을 제거하는 removeMin 함수를 작성하라.

import random   # 리스트에 랜덤한 정수들로 채워주기 위해 random 모듈을 import합니다.

def main() :
    numberList = random.sample(range(1,999),10) # 1부터 999까지의 랜덤한 정수 10개로 리스트를 초기화합니다.
    result = miniNum(numberList)                # 리스트에서 최솟값을 제거해주는 minNum함수를 불러와 결과값에 저장합니다. 
    print(result)                               # 결과를 출력합니다.

def miniNum(num) :                              # numberList 변수를 받아와 작업하는 함수입니다.
    first = True
    miniNum = 0
    for i in num :                              # 최솟값을 구하는 반복문입니다.
        if first == True :
            miniNum = i
            first = False
        elif miniNum > i :
            miniNum = i

    for i in range(len(num)) :                  # 최솟값을 구한 뒤 remove 메소드를 사용하지 않고 반복문과 pop메소드를 사용하여 최솟값을 제거합니다.
        if num[i] == miniNum :
            num.pop(i)
            break
    return num                                  # 최솟값을 제거 한 리스트를 리턴합니다.

main()