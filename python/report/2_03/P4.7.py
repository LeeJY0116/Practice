import random

word = list(input("\n단어를 입력해주세요"))

# 중간에 word[i]와 word[j]의 위치를 바꿔줘야 하기 때문에 list형으로 입력을 받습니다.

for wording in range(len(word)) :
    i = random.randint(0,len(word)-2)
    j = random.randint(i,len(word)-1)

# random 함수를 사용하여, i값을 구합니다. 
# 여기서 리스트의 인덱스는 len(word) -1이 끝이고,
# 단어에서 마지막이 아닌 랜덤 위치 i를 선택해야 하기 때문에 len(word) -2로 구해줍니다.
# j는 i보다 큰 랜덤 위치이기 때문에 i, len(word)-1을 사용하여 j값을 구해줍니다.

    sectOne = len(word) / 3
    firstSect = round(sectOne, 0)
    firstSect = int(firstSect)
    middleSect = firstSect * 2

# 문제에서 명시된 것처럼, first middle last로 부분 문자열을 만들기 위해 3등분 해줍니다.
# //를 사용하여 몫으로 나누면 한 쪽에 몰릴 수 있기 때문에 일반 나눗셈을 해 준 뒤, round 함수로 반올림 해줬습니다.
# 0부터 1/3 지점까지가 firstSect 1/3지점부터 2/3 지점까지 middleSect로 나누었습니다.

    word[i],word[j] = word[j],word[i]
    first = word[0:firstSect]
    middle = word[firstSect:middleSect]
    last = word[middleSect::]

# word의 i번째 인덱스와 j번째 인덱스의 위치를 서로 교환해 준 뒤,
# first, middle, last로 세 부분 문자열을 만들어 줬습니다.

String = "".join(word)

# 리스트 연산이 끝난 뒤, 문자열로 출력하고 싶을 수 있기 때문에 문자열로 출력하는 구문또한 추가했습니다.

print("\n문자열로 출력하면", String, "입니다.\n")

print("리스트로 출력하면",word, "입니다.\n")

print("리스트를 세등분하여 출력하면",first, middle, last, "입니다.")

# 리스트로 first, middle, last 세 부분 문자열을 이어 붙혀 출력하거나 word 리스트를 출력합니다.