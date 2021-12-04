# 문자열에 나오는 숫자의 수

userinput = input("문장을 입력하세요.")

numbers = '1234567890'
# 문자열에 안의 숫자를 찾기 위해 숫자가 들어있는 변수를 선언해줍니다.
count = 0
# 숫자를 세 줄 count 변수를 선언해줍니다.

for sentence in userinput:
    if sentence in numbers:
        count += 1

# 문자열을 하나씩 읽으며 숫자가 포함되어있는지 검사하고, 포함되어 있다면 count변수에 1을 더해줍니다.

print("문자열 안에 숫자의 갯수는" , count , "개 입니다.")