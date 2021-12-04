total = 0.0
nameinput = input("이름을 입력하세요.")
surinput = input("성을 입력하세요.")
userinput = input("점수를 입력하세요. 종료를 원한다면 -1을 입력하세요.")

while userinput != "-1" :
    name = str(nameinput)
    surname = str(surinput)
    fullname = name + " " + surname
    value = float(userinput)
    total = total + value
    userinput = input("점수를 입력하세요. 종료를 원한다면 -1을 입력하세요.")
    
print(fullname, "님의 총합 점수는 : %3d" % total,"입니다.")
print("END")