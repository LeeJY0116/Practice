# P 6.2 슛저룰 읽고 그것이 리스트에 없으면 추가하는 프로그램을 작성하라.
# 이 프로그램은 리스트의 원소가 열 개가 되면 리스트의 내용을 출력하고 종료한다.

numberList = []     # 빈 리스트를 선언합니다.

while len(numberList) < 10 :    # 리스트의 원소가 열 개가 될 때까지 반복하는 while문을 선언합니다.
    inputNumber = input("숫자를 입력하세요 :")
    if inputNumber not in numberList :      # 입력받은 원소가 리스트에 존재하지 않는다면 리스트에 원소를 추가하는 조건문을 활용합니다.
        numberList.append(inputNumber)

print(numberList)