def main() :
    ONE = 1
    TWO = 2
    scores = readFloats()
    if len(scores) > 1 :
        for i in range(TWO) :
            removeMinimum(scores)
        total = sum(scores)
        print("점수 :" , total)
    else :
        print("점수를 두 개 이상 입력하세요.")

def readFloats() :
    values = []
    print("점수를 입력하세요. Q를 입력하면 종료됩니다.", end = "")
    userInput = input()
    while userInput.upper() != "Q" :
        values.append(float(userInput))
        userInput = input()

    return values


def removeMinimum(values) :
    smallestPosition = 0
    for i in range(1, len(values)) :
        if values[i] < values[smallestPosition] :
            smallestPosition = i
    values.pop(smallestPosition)

main()