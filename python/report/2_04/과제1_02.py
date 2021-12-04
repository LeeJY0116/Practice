# 정수 시퀀스를 읽어서 다음을 출력하는 프로그램을 작성하라.
# d. 인접 수가 같은 경우를 모두 출력, 예를 들면 입력이 1 3 3 4 5 5 6 6 6 2일 때 프로그램은 3 5 6을 출력한다.

# 과제#1 P4.2d 문제에서 위의 값을 입력 받았을 때, 3 5 6 6 이 아닌 3 5 6이 출력되게 하라.


number = '1334556662'

previous = ''
current = ''

# 이전 문자와 현재 문자를 비교해 줄 공백 변수 두 개를 선언합니다.

for current in number:
    if previous == current:

# 이전 문자인 previous가 현재 문자인 current와 같은지 따집니다.

        print(current, end='')
        current = ''

# 만약 previous와 current가 같다면, current 변수를 출력한 뒤,
# 그 뒤에 같은 문자가 나올 경우에 또 다시 출력할 수 있기 때문에 current변수를 공백으로 초기화시켜줍니다.

    previous = current

# 조건문 검사가 끝난 뒤에 previous 변수에 current를 대입합니다.
# 만약 16번째 줄에서, current 변수를 공백으로 초기화 하지 않는다면 666이 나왔을 경우 6이 두 번 출력 되는 오류가 발생합니다.