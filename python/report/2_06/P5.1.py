# P5.1 다음 함수 및 테스트 프로그램을 작성하라.
# a. def smallest(x, y, z) (인자들 중 가장 작은 값을 반환함)
# b. def average(x, y, z) (인자들의 평균값을 반환함)

def main() :
    numlist = []                                    # 입력받은 숫자들을 넣어줄 배열을 선언합니다.
    for i in range(3) :                             # x, y, z 세 번 입력하기 위해 입력을 3번 반복해서 받는 반복문을 선언합니다.
        inputNumber = input("정수를 입력해주세요 : ")
        numlist.append(inputNumber)                 # num 배열에 입력 받은 값들을 추가해줍니다.
    smallest(numlist[0],numlist[1],numlist[2])      # 인자들 중 가장 작은 값을 반환하는 함수를 호출합니다.
    average(numlist[0],numlist[1],numlist[2])       # 인자들의 평균값을 반환하는 함수를 호출합니다.

def smallest(x, y, z) :                             # 인자들 중 가장 작은 값을 반환하는 함수를 정의합니다.
    minNum = min(x, y, z)                           # 인자들 중 가장 작은 값을 찾아 minNum 변수에 넣어줍니다.
    return print("가장 작은 값은 : " , minNum , "입니다.\n")# 가장 작은 값을 출력해주는 print문을 반환합니다.

def average(x, y, z) :                              # 인자들의 평균값을 반환하는 함수를 정의합니다.
    avgNum = 0                                      # 평균값을 저장할 변수를 선언합니다.
    sumNum = 0                                      # 평균값을 구하기 위해 인자들의 합을 넣어줄 변수를 선언합니다.
    numlist = [x, y, z]                             # numlist 리스트에 인자들을 넣어줍니다.
    for i in numlist :                              # numlist의 원소들을 i에 대입하는 for문입니다.
        sumNum += int(i)                            # 원소들의 총 합을 구해줍니다.
    avgNum = sumNum/len(numlist)                    # 원소들의 총 합에서 원소들의 갯수만큼 나눠 평균을 구해줍니다.
    return print("평균은 : %.1f"  %avgNum, "입니다.")     # 인자들의 평균값을 출력해주는 print문을 반환합니다.

main()                                              # main 함수를 호출합니다.