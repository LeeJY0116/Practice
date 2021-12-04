def main() :
    scores = readFloats()
    removeMinimum(scores, 2)        # scores에서 최솟값을 두 번 삭제하는 함수입니다.
    total = sum(scores)
    print("결과 : %.1f " %total)      # 결과값을 소수점 첫번째 자리까지 출력합니다.


def readFloats() :
    values = []
    trueFalse = False               # 범위 밖의 값을 입력받았을 때 다시 입력을 받기 위한 boolean 변수입니다.
    falseTrue = True                # 숫자가 아닌 값을 입력받았을 때 다시 입력을 받기 위한 boolean 변수입니다.
    quizValues = input("퀴즈 점수의 개수를 입력해주세요 4 ~ 10 :")
    while falseTrue == True:        # 숫자가 아닌 값을 입력받으면 재입력을 요구합니다.
        if quizValues.isdigit() != True :
            print("\n숫자가 아닌 값을 입력하였습니다.\n")
            quizValues = input("퀴즈 점수의 개수를 입력해주세요 4 ~ 10 :")
        else :
            falseTrue = False       # 숫자를 입력하면 falseTrue 변수를 False로 바꿈으로써 while문에서 빠져나옵니다.

    while trueFalse == False :      
        if int(quizValues) > 3 and int(quizValues) < 11 :       # 퀴즈 점수의 개수를 4부터 10까지의 정수로 입력받습니다. 
            trueFalse = True
            for i in range(int(quizValues)) :                   # 퀴즈 점수의 개수를 입력받았으면, 퀴즈 점수를 개수만큼 입력받습니다.
                userInput = input("퀴즈 점수를 입력해주세요 : ")
                values.append(float(userInput))
        else :
            print("\n범위 안의 값을 입력해주세요 ! \n")                 # 범위 밖의 숫자를 입력받으면 범위 안의 숫자를 입력해달라고 요구합니다.
            quizValues = input("퀴즈 점수의 개수를 입력해주세요 4 ~ 10 :")

    return values                                               # values값을 리턴합니다.

def removeMinimum(values, count) :                              # values에서 count만큼 최소값을 삭제하는 함수입니다.
    minNumber = 0

    for i in range(count) :                                     # count만큼 반복하는 for문입니다.
        for j in range(len(values)) :                           # 최소값의 인덱스를 찾아내는 for문입니다.
            if values[j] < values[minNumber] :
                minNumber = j
        values.pop(minNumber)                                   # 최소값을 삭제합니다.

main()