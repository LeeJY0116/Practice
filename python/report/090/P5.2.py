# P 5.2.a. def allTheSame(x, y, z) (모든 인자들의 값이 같으면 true를 반환함)
def main() :
    print("\nP 5.2.a. def allDifferent(x, y, z) (모든 인자들의 값이 같으면 true를 반환함)\n")
    num = []    # 입력받은 값을 저장해 줄 배열을 선언합니다.
    for i in range(3) : # 총 세 번 반복하는 반복문을 선언합니다.
        userinput = float(input("값을 입력 해 주세요 : "))
        num.append(userinput)   # num 배열 안에 입력 받은 값들을 추가 해 줍니다.
    allTheSame(num[0],num[1],num[2])    # 모든 인자들의 값이 같으면 True를 출력해주는 함수를 호출합니다.

def allTheSame(x, y, z) :   # 모든 인자들의 값이 같으면 True를 출력해주는 함수를 정의합니다.
    numlist = [x, y, z] # 비교연산을 하는데 사용할 numlist 배열안에 인자들을 넣어 선언 해 줍니다.

    if len(set(numlist)) == 1:
# set 함수는 중복 된 값은 자동으로 제거하는 기능이 있습니다.
# 그에 따라 모든 값이 같으면 배열의 길이는 1일 것이므로 배열의 길이가 1이라면 True 아니라면 False를 반환합니다.
        print('True')
    else:
        print('False')
main()  # main 함수를 호출합니다.


# P 5.2.b. def allDifferent(x, y, z) (모든 인자들의 값이 서로 다르면 true를 반환함)
def main() :
    print("\nP 5.2.b. def allDifferent(x, y, z) (모든 인자들의 값이 서로 다르면 true를 반환함)\n")
    num = []    # 입력받은 값을 저장해 줄 배열을 선언합니다.
    for i in range(3) : # 총 세 번 반복하는 반복문을 선언합니다.
        userinput = float(input("값을 입력 해 주세요 : "))
        num.append(userinput)   # num 배열 안에 입력 받은 값들을 추가 해 줍니다.
    allDifferent(num[0],num[1],num[2])  # 모든 인자들의 값이 서로 다르면 True를 출력해주는 함수를 호출합니다.

def allDifferent(x, y, z) : # 모든 인자들의 값이 서로 다르면 True를 출력해주는 함수를 정의합니다.
    numlist = [x, y, z] # 비교연산을 하는데 사용할 numlist 배열안에 인자들을 넣어 선언 해 줍니다.

    if len(set(numlist)) == len(numlist):
# set 함수는 중복 된 값은 자동으로 제거하는 기능이 있습니다.
# 그에 따라 모든 값이 다르면 배열의 길이는 numlist배열의 길이와 같을 것이므로,
# 배열의 길이가 len(numlist)라면 True 아니라면 False를 반환합니다.
        print('True')
    else:
        print('False')
main()  # main 함수를 호출합니다.

# P 5.2.c. def sorted(x, y, z) (인자들이 작은 값이 먼저 나오는 순서대로 정렬되어 있으면 true를 반환함)
def main() :
    print("\nP 5.2.c. def sorted(x, y, z) (인자들이 작은 값이 먼저 나오는 순서대로 정렬되어 있으면 true를 반환함)\n")

    num = []    # 입력받은 값을 저장해 줄 배열을 선언합니다.
    for i in range(3) : # 총 세 번 반복하는 반복문을 선언합니다.
        userinput = float(input("값을 입력 해 주세요 : "))
        num.append(userinput)   # num 배열 안에 입력 받은 값들을 추가 해 줍니다.
    is_sorted(num[0],num[1],num[2]) # 인자들이 작은 값이 먼저 나오는 순서대로 정렬되어 있는지 확인해주는 함수를 호출합니다.

def is_sorted(x, y, z) :    # 인자들이 작은 값이 먼저 나오는 순서대로 정렬되어 있는지 확인해주는 함수를 정의합니다.
    numlist = [x, y, z] # 비교연산을 하는데 사용할 numlist 배열안에 인자들을 넣어 선언 해 줍니다.
    is_sort = (sorted(numlist) == numlist)  # sotred함수를 사용하여 정렬 된 numlist배열과 현재 numlist 배열이 같은지 검사합니다.
    if is_sort :    # 같다면 True를 다르다면 False를 반환합니다.
        return print('True')
    else :
        return print('False')
main()  # main 함수를 호출합니다.
