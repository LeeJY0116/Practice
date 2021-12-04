# 문자열에 나오는 모든 모음을 밑줄 문자로 교체한 문자열

userinput = input("문장을 입력하세요.")

vowels = 'aeiouAEIOU'
# 모음을 찾아내기 위한 변수를 선언합니다.
result = ""
# 모음을 _로 변경한 문자열을 저장할 빈 문자열을 선언합니다.

for sentence in userinput:
    if sentence not in vowels:
        result += sentence
    else :
        result += '_'
# sentence 안에 vowels가 없다면 result에 sentence를 추가합니다.
# sentence 안에 vowels가 없다면 result에 _를 추가합니다.

print(result)