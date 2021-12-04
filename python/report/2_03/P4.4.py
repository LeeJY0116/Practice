# How To 4.1 프로그램을 완성하라. 
#프로그램은 열두 개의 온도를 읽어서 가장 온도가 높은 달을 출력한다.

highestMonth = 1
highestTemperature = 0.0
# 비교를 위해 최고 온도를 기록할 변수와, 최고 온도였던 달을 기록할 변수를 선언합니다.

# 1월부터 12월을 표현하기 위해 0부터 시작하지 않고, 1부터 13까지의 범위로 for문을 반복합니다.
for Month in range(1, 13) :
    userinput = float(input("온도를 입력하세요."))
    if userinput > highestTemperature :
        highestTemperature = userinput
        highestMonth = Month
# for문이 반복되는 동안 온도를 입력받고, 가장 높은 온도를 입력받을 때 마다 if문을 실행하여
# 가장 높은 온도를 새로 highestTemperature 변수에 입력하고, 그 때의 달을 highestMonth에 입력합니다.

print("온도가 가장 높았던 달은", highestMonth,"월이며, 가장 높았던 온도는", highestTemperature, end = "도 입니다.")
