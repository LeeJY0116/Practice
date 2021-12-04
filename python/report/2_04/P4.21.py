# 정수를 하나 읽어서(한 변의 길이가 그 정수인) 내부가 찬 정사각형과 내부가 빈 정사각형을 *를 이용해서 그리되, 서로 인접해서 나오도록 그리는 프로그램을 작성하라.


size = int(input("정수를 입력하세요 : "))
count = 0

# 첫 번째 줄과 마지막 줄에서만 빈공간이 없이 출력하기 때문에 첫 번째와 마지막에만 동작하는 조건문을 위해 count 변수를 선언합니다.

while count < size+1 :

# count는 1씩 오르기 때문에, count가 size와 동일한 값이 될 때 까지 반복하는 while문을 빠져나옵니다.

    for i in range(size) :
        print("*",end="")
    print(end=" ")

# 꽉 찬 정사각형은 모든 열이 size만큼 *로 차있기 때문에, while문이 시작될 때마다 size만큼 *을 출력하고, 한 칸 띄어줍니다.

    if count == 0 or count == size :
        for i in range(0, size) :
            print("*",end="")
        print()

# 그 뒤에 count변수를 이용하여 첫 번째 줄이거나 마지막 줄일경우 분기하여 size만큼 *을 출력합니다. 

    else :
        print("*",end="")
        for i in range(size - 2) :
            print(" ",end="")
        print("*", end="")
        print()
    count = count + 1


# 첫 번째 줄과 마지막 줄이 아니라면, *을 출력하고 for루프문을 사용하여 size -2 만큼 공백을 출력한 뒤 다시 *을 출력하여 공백이 있는 사각형을 만들어 줍니다.
# 마지막에 줄바꿈을 위한 print문을 출력하고 count를 1만큼 올린 뒤 새로운 줄에서 다시 while문을 반복합니다.