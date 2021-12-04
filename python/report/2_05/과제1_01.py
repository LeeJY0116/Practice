# P6.5 - 6.3절의 largest.py를 가장 작은 값과 가장 큰 값을 출력

import random   # 리스트에 랜덤한 정수들로 채워주기 위해 random 모듈을 import합니다.

values = random.sample(range(1,999),10) # 1부터 999까지의 랜덤한 정수 10개로 리스트를 초기화합니다.

largest = values[0] # 최댓값을 넣어줄 변수를 0번째 인덱스로 초기화합니다.
smallest = values[0]    # 최솟값을 넣어줄 변수를 0번째 인덱스로 초기화합니다.

for i in range(len(values)-1,0,-1) :    # 최댓값과 최솟값을 구해줄 for문을 작성합니다.
    if values[i] < smallest :   # 1번째 인덱스까지 역순으로 내려가면서 각 인덱스의 값이
        smallest = values[i]    # smallest 변수값보다 작다면 smallest에 values[i]를 넣습니다.
    if values[i] > largest :    # 1번째 인덱스까지 역순으로 내려가면서 각 인덱스의 값이
        largest = values[i]     # largest 변수값보다 크다면 largest에 values[i]를 넣습니다.

print("가장 작은 값은", smallest , "입니다.")
print("가장 큰 값은", largest, "입니다.")