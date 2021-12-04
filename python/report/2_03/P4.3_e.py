# 문자열에 나오는 모든 모음의 위치

userinput = input("문장을 입력하세요.")

vowels = 'aeiouAEIOU'
# 모음을 찾아내기 위한 변수를 선언합니다.
result = []
# 모음자리의 인덱스를 저장해 줄 리스트를 선언합니다.

for i in range(len(userinput)):
    if userinput[i] in vowels:
        result.append(i)

# 입력받은 문자열의 길이만큼 반복하는 for문을 만들고
# if문에서 문자열의 i번째 인덱스에 모음이 존재한다면 result에 i를 추가해줍니다.

print("문자열 안에 모음의 위치는", result, "번 인덱스에 위치하고 있습니다.")