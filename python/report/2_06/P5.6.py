# P5.6 다음 함수를 작성하라
# def countVowels(string)
# 이 함수는 문자열 string 내에 있는 모음의 수를 반환한다.
# 모음은 글자 a, e, i, o, u와 이들의 대문자이다.


def main() :
    inputString = input("문장을 입력해주세요 : ")          # 사용자에게 문장을 입력받습니다.
    print(countVowels(inputString))                 # 문장에서 모음의 갯수를 반환해주는 함수를 호출하여 프린트합니다.

def countVowels(string) :                           # 문장에서 모음의 갯수를 반환해주는 함수를 정의합니다.
    vowels = ['a','e','i','o','u']                  # 모음 a e i o u를 리스트로 선언해줍니다.
    count = 0                                       # 모음의 개수를 세줄 count 변수를 선언해줍니다.
    for i in string :                               # i에 string을 한 글자씩 대입하며 반복합니다.
        if i.lower() in vowels :                    # 리스트에 모음의 소문자만 넣었기 때문에, lower함수로 소문자로 변경해 준 뒤에 vowels 리스트에 있는 글자인지 확인합니다.
            count += 1                              # vowels에 포함되어 있다면 카운트를 1 올립니다.
    return count                                    # count를 반환합니다.

main()