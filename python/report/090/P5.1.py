def main() :
    num = []    # 입력받은 숫자들을 넣어줄 배열을 선언합니다.
    for i in range(3) : # x, y, z 세 번 입력하기 위해 입력을 3번 반복해서 받는 반복문을 선언합니다.
        userinput = float(input("x, y, z 값을 입력하세요 : "))
        num.append(userinput)   # num 배열에 입력 받은 값들을 추가해줍니다,
    smallest(num[0],num[1],num[2])  # 인자들 중 가장 작은 값을 반환하는 함수를 호출합니다.
    average(num[0],num[1],num[2])   # 인자들의 평균값을 반환하는 함수를 호출합니다.
def smallest(x, y, z) : # 인자들 중 가장 작은 값을 반환하는 함수를 정의합니다.
    print() # 가독성을 위한 빈 칸 한 줄입니다.
    print("P5.1.a. def smallest(x, y, z) (인자들 중 가장 작은 값을 반환함)\n")   # 문제 내용입니다.
    return print("가장 작은 값은 : " , min(x,y,z) , "입니다.\n") # 가장 작은 값을 출력해주는 print문을 반환합니다.


def average(x, y, z) :  # 인자들의 평균값을 반환하는 함수를 정의합니다.
    print("P5.1.b. def average(x,y,z) (인자들의 평균값을 반환함)\n")   # 문제 내용입니다.
    numlist = [x, y, z] # 평균을 구하기 위해 배열을 선언해줍니다.
    sum = 0 # 배열 안의 모든 값을 더해주기 위해 sum 변수를 0으로 초기화해줍니다.
    for i in range(len(numlist)) :  # numlist의 길이만큼 반복하는 반복문을 선언합니다.
        sum += numlist[i]   # 배열의 모든 값을 더해주는 반복문입니다.

    return print("평균은 : %.1f"  %float(sum/len(numlist)), "입니다.")    # 인자들의 평균값을 출력해주는 print문을 반환합니다.

main()  # main 함수를 호출합니다.



