# P 6.7 min 함수 또는 remove 메소드를 사용하지 말고 리스트에서 최솟값을 제거하는 removeMin 함수를 작성하라.

import random

def main() :
    numberList = random.sample(range(1,999),10)
    result = miniNum(numberList)
    print(result)

def miniNum(num) :
    first = True
    miniNum = 0
    for i in num :
        if first == True :
            miniNum = i
        elif miniNum > i
            miniNum = i
    return miniNum

main()