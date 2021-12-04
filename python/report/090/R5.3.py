
# R 5.3 a.
def main() :
    print("R 5.3 a. 두 정수 중 큰 수를 구하기")
    num = []    # 정수를 저장할 빈 배열을 선언합니다.
    for i in range(2) :  #정수를 배열에 넣어줄 반복문을 실행합니다.
        userinput = int(input("정수 두 개를 입력하세요."))
        num.append(userinput)
    result = maximum(num) # 정수중 가장 큰 수를 구해주는 maximum 함수를 호출합니다.
    print("가장 큰 정수는 ", result, "입니다.")
def maximum(num) :
    maxnum = max(num) #num 배열에서 가장 큰 정수를 maxnum 변수로 저장합니다.
    return maxnum

main()


# R 5.3 b.
from random import random   # random 함수를 사용하기 위해 import 해줍니다.
def main() :
    print("R 5.3 b. 세 개의 부동-소수점 수 중 가장 작은 수를 구하기")
    nnum = []    # 변수를 저장할 빈 배열을 선언합니다.
    for i in range(3) : # 세 개의 숫자를 비교하므로 3번 반복 실행하는 반복문을 선언합니다.
        number = random()   # 부동-소수점을 생성해주는 random() 함수를 호출합니다.
        nnum.append(number) # 호출받은 부동-소수점을 nnum 배열에 추가합니다.
    print("부동-소수점 목록은", nnum , "입니다.")   # 비교할 부동-소수점들의 목록을 출력합니다.
    result = minimum(nnum)   # minimum 함수를 호출합니다.
    print("가장 작은 실수는 ", result, "입니다.") # 계산 결과를 출력합니다.
def minimum(nnum) :  # 함수를 선언합니다.
    mininum = min(nnum)  # nnum 배열에서 가장 작은 수를 minimum 변수에 저장합니다.
    return mininum  # minimum을 리턴합니다.

main()


# R 5.3 c.
def main() :
    print("R 5.3 c. 어떤 정수가 소수인지 검사하기. 소수면 True를, 아니면 False를 반환함")
    userinput = int(input("숫자를 입력하세요 : "))  # 소수인지 구분할 정수를 입력받습니다.

    if meprime(userinput) : # 소수인지 계산해주는 함수인 meprime 함수를 호출해서 값이 True로 반환된다면 True를 출력하고 그게 아니면 False를 출력하는 조건문을 선언합니다.
        print("True")
    else :
        print("False")

def meprime(i) :
    if i == 1 : # 1은 소수의 조건엔 부합하지만, 소수가 아니기 때문에 따로 특별처리 하여 False를 반환합니다.
        return False

    if i == 2 : # 소수를 계산하려면, 2 , 3 , 5 로 나눴을 때 모두 나머지가 0이 아니어야 하지만, 2는 소수이지만 2로 나누면 나머지가 0이라 다른 조건식에서 False로 반환되기 때문에 특별처리로 True를 반환하게 합니다.
        return True

    if i % 2 == 0 : # 정수를 2로 나눠 나머지가 0이라면 소수가 아니기 때문에 False를 반환합니다.
        return False

    count = 3   # 소수는 2와 3과 5로 나누어보면 소수인지 아닌지 알 수 있기 때문에, 여기선 3으로 나누어 나머지를 계산하기 위해 count라는 변수를 만들어 3을 대입해줍니다.
    while count * count <= i :  # while count <= i 로 해버리면, 5가 입력됐을 경우 False가 반환되기 때문에, count * count 로 해줍니다.
        if i % count == 0 :
            return False
        count = count + 2   # 3으로 나눴을 때 나머지가 0이 아니었다면, 마지막으로 5로 나눠볼 수 있게 count에 + 2를 더해주어 5로 나눠볼 수 있게 해줍니다.
    return True # 3과 5의 나머지를 계산하는 반복문이 False로 반환되지 않고 끝나면 True를 반환합니다.
main()  # main 함수를 호출합니다.


# R 5.3 d.
def main() :
    print("R 5.3 d. 어떤 문자열이 다른 문자열에 포함되어 있는지 검사하기")
    userinput = str(input("문자열을 입력하세요 :"))  # 문자열을 입력 받습니다.
    inputuser = str(input("비교할 문자열을 입력하세요 :"))  # 비교할 문자열을 또 한 번 입력 받습니다.
    if mesentence(userinput, inputuser) :   # 어떤 문자열이 다른 문자열에 포함되어 있는지 검사해주는 함수를 호출하여, True값을 리턴 받으면 True를, 그게 아니면 False를 출력합니다.
        print("True")
    else :
        print("False")

def mesentence(rule, ruler) :
    if ruler in rule :  # in을 사용하여 문자열이 포함되어 있는지 확인합니다.
        return True
    else :
        return False
main()  # main 함수를 호출합니다.

# R 5.3 e.

def main() :
    print("R 5.3 e. 초기 잔액, 연 이자율, 저축 햇수가 주어졌을 때 계좌의 잔액 계산하기")

    START = float(input("초기 잔액을 입력하세요 : ")) # 초기자금을 입력 받습니다.
    PLUS = float(input("연 이자율을 입력하세요 : " )) # 연 이자율을 입력 받습니다.
    YEAR = int(input("저축 햇수를 입력하세요 : " ))   # 저축 햇수를 입력 받습니다.
    result(START,PLUS,YEAR) # result 라는 계좌 잔액을 계산해주는 함수를 호출합니다.
def result(mestart,meplus,meyear) : # result 함수를 정의합니다.
    money = mestart # 계좌 잔액 변수를 만들어 초기자금을 대입합니다.
    for i in range(1, meyear + 1) : # 1년차부터 입력받은 햇수까지 출력해야 하기 때문에 0부터 시작이 아닌 1부터 시작하였고 그에 따라서 최대치도 +1을 해줬습니다.
        balance = money * meplus / 100  # 연 이자를 구해줍니다.
        money = money + balance # 계좌 잔액과 연 이자를 더해줍니다.
        print(i,"년 후 :  %.1f" % money,"원") # 소수점 1자리까지만 출력합니다.
main()  # main 함수를 호출합니다.



# R 5.3 f.

def main() :
    print("R 5.3 f. 초기 잔액, 연 이자율이 주어졌을 때 주어진 기간 동안의 계좌 잔액을 출력하기")

    START = float(input("초기 잔액을 입력하세요 : ")) # 초기자금을 입력 받습니다.
    PLUS = float(input("연 이자율을 입력하세요 : " )) # 연 이자율을 입력 받습니다.
    DAY = int(input("지난 날짜를 입력하세요 : " ))   # 저축 일수를 입력 받습니다.
    ONE_YEAR = 365  # 이자는 연 이자이기 때문에 계산을 위해 365일 상수형 변수를 선언합니다.
    YEAR = DAY // ONE_YEAR  # 저축 일수를 상수형 변수 ONE_YEAR로 나눠서 저축 햇수를 나타내는 YEAR 변수에 대입해줍니다.
    result(START,PLUS,DAY,YEAR) # result 라는 계좌 잔액을 계산해주는 함수를 호출합니다.

def result(mestart,meplus,meday,meyear) : # result 함수를 정의합니다.
    money = mestart # 계좌 잔액 변수를 만들어 초기자금을 대입합니다.

    if meday == 0 : # 1년이 지나지 않았을 경우 이자가 붙지 않습니다.
        return
    else :
        for i in range(1, meyear + 1) : # 1년차부터 입력받은 햇수까지 출력해야 하기 때문에 0부터 시작이 아닌 1부터 시작하였고 그에 따라서 최대치도 +1을 해줬습니다.
            balance = money * meplus / 100  # 연 이자를 구해줍니다.
            money = money + balance # 계좌 잔액과 연 이자를 더해줍니다.
    print(meday , "일(", meyear ,")년 후 :  %.1f" % money,"원") # 소수점 1자리까지만 출력합니다.
main()  # main 함수를 호출합니다.


# R 5.3 g.
import calendar # 달력 출력을 위해 calender 함수를 import 합니다.

def main() :
    print("R 5.3 g. 연도, 달이 주어지면 달력 출력하기")

    YEAR = int(input("희망 연도를 입력 하세요 : " ))  # 희망 연도를 입력받습니다.
    MONTH = int(input("희망 달을 입력 하세요 : " ))  # 희망 달을 입력받습니다.
    calen(YEAR,MONTH)   # 달력을 출력해주는 함수를 호출합니다.

def calen(meyear,memonth) :
    print(calendar.month(meyear,memonth))
main()  # main 함수를 호출한다.
# R 5.3 h.

import calendar # 달력 출력을 위해 calender 함수를 import 합니다.

def main() :
    print("R 5.3 h. 연도, 달, 날짜가 주어졌을 때 요일 계산하기 '월요일' 같이 문자열로")

    YEAR = int(input("희망 연도를 입력 하세요 : " ))  # 희망 연도를 입력받습니다.
    MONTH = int(input("희망 달을 입력 하세요 : " ))  # 희망 달을 입력받습니다.
    DAY = int(input("희망 날짜를 입력 하세요 : " ))   # 희망 날짜를 입력받습니다.
    calen(YEAR,MONTH,DAY)   # 입력받은 날짜가 무슨 요일인지 출력해주는 함수를 호출합니다.

def calen(meyear,memonth,meday) :
    today = calendar.weekday(meyear,memonth,meday)  # calendar.weekday 함수를 사용하면 월요일부터 0 ~ 6의 숫자로 나오기 때문에 문자열로 출력하기 위해서 today 변수를 만들어 입력받았습니다.
    if today == 0 : # 0일경우 "월요일" 출력
        print("월요일")
    elif today == 1 :   # 1일경우 "화요일" 출력
        print("화요일")
    elif today == 2 :   # 2일경우 "수요일" 출력
        print("수요일")
    elif today == 3 :   # 3일경우 "목요일" 출력
        print("목요일")    
    elif today == 4 :   # 4일경우 "금요일" 출력
        print("금요일")
    elif today == 5 :   # 5일경우 "토요일" 출력
        print("토요일")
    else :  # 그 외는 한가지 뿐이므로 "일요일" 출력
        print("일요일")
main()

# R 5.3 i.

from random import *    # 랜덤 정수 함수를 호출하기 위해 import 해줍니다.
def main() :
    print("R 5.3 i. 1과 n 사이의 랜덤 정수 생성하기")

    userinput = int(input("정수를 입력하세요 : "))  # n을 입력받아 설정합니다.
    integer(userinput)  # 랜덤 정수를 출력해주는 integer 함수를 호출합니다.
def integer(n) :
    value = randint(0 , n)  # 0부터 n 사이의 랜덤한 정수를 value 변수에 저장해줍니다.
    print(value)    # value를 출력합니다.
main()  # main 함수를 호출합니다.
