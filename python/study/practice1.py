IMAX = 10
NMAX = 4

for n in range ( 1 , NMAX + 1 ) :
    print("%10d" % n , end="")
print("\n")

for n in range ( 1 , NMAX + 1 ) :
    print("%10s" % "x ", end="")

print("\n", " " "-" *20)

for i in range ( 1 , IMAX + 1 ) :
    print("\n")
    for n in range ( 1 , NMAX + 1 ) :
        print("%10.0f" %i ** n , end="")


def main() :
    inputuser = int(input("입력할 문자열의 갯수를 입력해주세요 : "))

    if mesentence(inputuser) :
        print("이 문자열은 다른 문자열에 포함 되어 있습니다.")
    else :
        print("이 문자열은 어느 문자열에도 포함되어 있지 않습니다.")

def mesentence(sent) :
    count = []
    for i in range(sent) :
        userinput = str(input("문자열을 입력해주세요."))
        if userinput in count[0:i] :
            print("이 문자열은 다른 문자열에 포함 되어 있습니다.")
        else :
            print("이 문자열은 어느 문자열에도 포함되어 있지 않습니다.")
        count.append(userinput)
    print(count[0])

main()
