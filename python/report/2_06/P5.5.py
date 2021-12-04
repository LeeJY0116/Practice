# P5.5 다음 함수를 작성하라.
# def repeat(string, n, delim)
# 이 함수는 string 문자열을 n번 반복하는데, 문자열 사이를 delim 문자열로 구분하여 반환한다.
# 예를 들면repeat("ho", 3, ", ")는 "ho, ho, ho"를 반환한다.

def main() :
    inputString = input("문장을 입력해주세요 : ")              # 문장을 입력받습니다.
    inputNumber = int(input("반복할 횟수를 입력해주세요 : "))    # 사용자에게 반복횟수를 입력받습니다.
    repeat(inputString, inputNumber, ", ")              # 문자열을 반복해주는 repeat 함수를 호출합니다.




def repeat(string, n, delim) :                          # 문자열을 반복해주는 repeat 함수를 정의합니다.
    for i in range(n) :                                 # 사용자에게 입력받은 반복횟수만큼 반복하는 for문을 정의합니다.
        if i == n-1:                                    # 마지막 반복이라면 구분자가 필요 없기 때문에 프린트만 해줍니다.
            print(string)
        else :
            print(string, end=delim)                    # 마지막 반복이 아니라면, 입력받은 문자열을 프린트 하고 end = delim으로 구분자를 만들어줍니다.

main()