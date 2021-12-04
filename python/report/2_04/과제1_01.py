inputString = input("숫자를 포함하는 문자열 입력 : ")
# 사용자에게 문자열을 입력받습니다.

digitSearch = len(inputString) - 1
found = False

# 숫자를 찾았을 경우에는 숫자의 위치, 그렇지 않을 경우 문자열을 재 출력 해줘야 하기 때문에 boolean 변수인 found를 선언해줍니다.
# 마지막 숫자를 찾기위해서는 마지막 인덱스부터 검사해야 하기 때문에 인덱스에 사용할 변수를 입력받은 문자열 길이의 -1로 선언해줍니다.

while digitSearch >= 0 :
# 인덱스변수가 0이 될 때 까지 숫자를 찾습니다.
    if inputString[digitSearch].isdigit():
        found = True
        break

# 숫자를 찾는다면, 숫자의 위치를 출력하고 found를 True로 변경하며 break문을 사용하여 while문에서 탈출합니다.

    else :
        digitSearch = digitSearch - 1

# 숫자를 찾지 못했다면 인덱스변수의 값을 1씩 내리며 마지막에서 처음까지 순차적으로 검사합니다.

if found :
    print("마지막 숫자의 위치 : ", digitSearch)
else :
    print("문자열에 숫자가 포함되지 않음", inputString)

# found가 True라면 숫자를 찾았기 때문이니, 마지막 숫자의 위치를 출력합니다.
# while문이 종료되도록 숫자를 찾지 못했다면 숫자를 포함하지 않은 문자열이라며 입력받은 문자열을 다시 한 번 출력합니다.
