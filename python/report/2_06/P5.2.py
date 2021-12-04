# P5.2 다음 함수 및 테스트 프로그램을 작성하라.


# P 5.2.a def allTheSame(x, y, z) (모든 인자들의 값이 같으면 true를 반환함)
def main() :
    print("\nP 5.2.a. def allDifferent(x, y, z) (모든 인자들의 값이 같으면 true를 반환함)\n")
    num = []    # 입력받은 값을 저장해 줄 배열을 선언합니다.
    for i in range(3) : # 총 세 번 반복하는 반복문을 선언합니다.
        inputNumber = float(input("값을 입력해주세요 : "))
        num.append(inputNumber)   # num 배열 안에 입력 받은 값들을 추가 해 줍니다.
    allTheSame(num[0],num[1],num[2])    # 모든 인자들의 값이 같으면 True를 출력해주는 함수를 호출합니다.

def allTheSame(x, y, z) :   # 모든 인자들의 값이 같으면 True를 출력해주는 함수를 정의합니다.
    numlist = [x, y, z] # 비교연산을 하는데 사용할 numlist 배열안에 인자들을 넣어 선언 해 줍니다.

    if x == y == z:
# 모든 인자가 같다면 True 아니라면 False를 반환합니다.
        print('True')
    else:
        print('False')
main()  # main 함수를 호출합니다.


# P 5.2.b. def allDifferent(x, y, z) (모든 인자들의 값이 서로 다르면 true를 반환함)
def main() :    # 똑같은 main함수를 반복하여 allDifferent 함수를 호출합니다.
    print("\nP 5.2.b. def allDifferent(x, y, z) (모든 인자들의 값이 서로 다르면 true를 반환함)\n")
    num = [] 
    for i in range(3) :
        inputNumber = float(input("값을 입력해주세요 : "))
        num.append(inputNumber)
    print(allDifferent(num[0],num[1],num[2]))      # 모든 인자들의 값이 서로 다르면 True를 출력해주는 함수를 호출합니다.

def allDifferent(x, y, z) : # 모든 인자들의 값이 서로 다르면 True를 출력해주는 함수를 정의합니다.
    numlist = [x, y, z] # 비교연산을 하는데 사용할 numlist 배열안에 인자들을 넣어 선언 해 줍니다.

    if x!= y!= z:
# 모든 인자가 서로 다르다면 True 아니라면 False를 반환합니다.
        return True
    else:
        return False
main()  # main 함수를 호출합니다.

# P 5.2.c. def sorted(x, y, z) (인자들이 작은 값이 먼저 나오는 순서대로 정렬되어 있으면 true를 반환함)
def main() :    # 동일한 main함수를 반복하여 is_sorted 함수를 호출합니다.
    print("\nP 5.2.c. def sorted(x, y, z) (인자들이 작은 값이 먼저 나오는 순서대로 정렬되어 있으면 true를 반환함)\n")

    num = []
    for i in range(3) :
        inputNumber = float(input("값을 입력해주세요 : "))
        num.append(inputNumber)
    print(is_sorted(num[0],num[1],num[2])) # 인자들이 작은 값이 먼저 나오는 순서대로 정렬되어 있는지 확인해주는 함수를 호출합니다.

def is_sorted(x, y, z) :    # 인자들이 작은 값이 먼저 나오는 순서대로 정렬되어 있는지 확인해주는 함수를 정의합니다.
    numlist = [x, y, z] # 비교연산을 하는데 사용할 numlist 배열안에 인자들을 넣어 선언 해 줍니다.
    is_sort = (sorted(numlist) == numlist)  # sotred함수를 사용하여 정렬 된 numlist배열과 현재 numlist 배열이 같은지 검사합니다.
    if is_sort :    # 같다면 True를 다르다면 False를 반환합니다.
        return True
    else :
        return False
main()  # main 함수를 호출합니다.
