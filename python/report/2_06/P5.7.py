# P5.7 다음 함수를 작성하라.
# def countWords(string)
# 이 함수는 string에 있는 단어 수를 반환한다. 단어는 공백으로 분리된다.
# 예를 들면 countWords("Mary had a little lamb")에 대해서 5를 반환한다.

def main() :
    inputString = input("문장을 입력해주세요 : ")              # 사용자에게 문장을 입력받습니다.
    print(countWords(inputString))                      # 단어의 개수를 세서 반환해주는 함수를 호출하여 출력합니다.

def countWords(string) :                                # 단어의 개수를 세서 반환해주는 함수를 정의합니다.
    count = len(string.split(' '))                      # 문장에서 공백의 개수를 세어 count 변수에 입력해줍니다.
    return count                                        # count 변수를 반환해줍니다.

main()