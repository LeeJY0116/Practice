# P5.3 다음 함수를 작성하고 테스트 프로그램을 제공하라.

# P5.3.a def firstDigit(n) (인자의 처음 숫자를 반환함)
# P5.3.b def lastDigit(n) (인자의 마지막 숫자를 반환함)
# P5.3.c def digits(n) (인자의 숫자 개수를 반환함)

def main() :
    inputString = input("문장을 입력해주세요 : ")     # 문장을 입력받습니다.

    firstDigit(inputString)                     # 인자의 처음 숫자를 반환하는 함수를 호출합니다.
    lastDigit(inputString)                      # 인자의 마지막 숫자를 반환하는 함수를 호출합니다.
    digits(inputString)                         # 인자의 숫자 개수를 반환하는 함수를 호출합니다.

def firstDigit(n) :                             # 인자의 처음 숫자를 반환하는 함수를 정의합니다.
    for i in n :
        if i.isdigit() :                        # 인자의 글자 하나씩 비교하다가 숫자가 나오면 프린트하고 반복문을 멈춥니다.
            print("인자의 첫번째 숫자는" , i , "입니다.")
            break

def lastDigit(n) :                              # 인자의 마지막 숫자를 반환하는 함수를 호출합니다.
    for i in reversed(n):
        if i.isdigit() :                        # for문을 뒤에서부터 반복하여 인자의 맨 뒤 글자부터 하나씩 비교하다가 숫자가 나오면 프린트하고 반복문을 멈춥니다.
            print("인자의 마지막 숫자는" , i , "입니다.")
            break

def digits(n) :                                 # 인자의 숫자 개수를 반환하는 함수를 호출합니다.
    count = 0                                   # 인자의 숫자 개수를 세 줄 카운트 변수를 선언합니다.
    for i in n :                                # 인자의 글자 하나씩 비교하다가 숫자가 나오면 count변수를 1만큼 올립니다.
        if i.isdigit() :
            count += 1
    print("인자의 숫자 개수는", count , "개 입니다.")    # 반복문이 끝난 뒤 count를 출력합니다.
main()