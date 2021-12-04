# P5.4 다음 함수를 작성하라.
# def middle(string)
# 이 함수는 string의 길이가 홀수이면 중간 글자를 가지고 있는 문자열을,
# 길이가 짝수이면 두 개의 중간 글자를 가진 문자열을 반환한다.
# 예를 들면 middle("middle")은 "dd"를 반환한다.

def main() :
    inputString = input("문장을 입력해주세요 : ")      # 문장을 입력받습니다.

    middle(inputString)                         # 홀수, 짝수에 따라 중간글자를 반환하는 middle 함수를 호출합니다.


def middle(Str) :                               # 홀수, 짝수에 따라 중간글자를 반환하는 middle 함수를 정의합니다.
    if len(Str) % 2 == 0 :                      # 2와 나눈 나머지 값이 0일 경우, 짝수일 경우
        print(Str[(len(Str)//2 -1)],end="")     # 두 개의 중간 글자를 반환합니다.
        print(Str[(len(Str)//2)])
    else :                                      # 그것이 아닐 경우, 홀수일 경우
        print(Str[len(Str)//2])                 # 중간 글자를 반환합니다.

main()