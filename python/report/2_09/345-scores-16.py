infile = open("indata-1.txt", "r")
outfile = open("outdata-1.txt", "w")

def main() :
    readFloats()


def readFloats() :
    lines = 0
    numbers = infile.readline()
    while numbers != "" :
        lines += 1
        numbers = numbers.split()       # 텍스트 파일에서 읽어 온 첫번째 줄을 split 함수를 이용하여 리스트로 분리합니다.
        values = []                     # 범위에서 벗어난 값들을 제외한 값들을 저장 할 빈 리스트 변수를 만들어줍니다.
        print("-----------------------------------------", lines , "번째 줄-----------------------------------------------")
        print("입력 받은 값", numbers)
        for i in range(len(numbers)) :
            if len(numbers) > 12 or len(numbers) < 3 :           # 퀴즈점수의 개수가 2개 이하거나 13개 이상일 경우 오류메시지를 출력합니다.
                print(i+1,"번째 퀴즈점수의 개수가 2개 이하거나 13개 이상입니다.")
                break
            try :
                if float(numbers[i]) < 0:                        # 0보다 작은 수를 읽었을 때 오류메시지를 출력합니다.
                    print("0보다 작은 수가 존재하여 제외합니다.",i, "번 인덱스 ", "'", numbers[i], "'")
                elif float(numbers[i]) > 10 :                    # 10보다 큰 수를 읽었을 때 오류메시지를 출력합니다.
                    print("10보다 큰 수가 존재하여 제외합니다.",i, "번 인덱스 ", "'", numbers[i], "'")
                else :
                    values.append(float(numbers[i]))             # 0보다 크며 10보다 작고 숫자인 값을 values 리스트에 추가합니다.
            except ValueError:                                   # 숫자가 아닌 값을 읽었을 때, except하여 오류메시지를 출력합니다.                     
                print("숫자가 아닌 값이 존재하여 제외합니다.",i, "번 인덱스 ", "'",numbers[i],"'")
                continue
        print("퀴즈 원점수:", values, end=" | ")
        print("퀴즈 원점수:", values, end=" | ", file=outfile)
        removeMinimum(values, 2)
        print("퀴즈 유효점수:", values, end = " | ")
        print("퀴즈 유효점수:", values, end = " | ", file=outfile)
        total = sum(values)
        print("최종점수\t:\t%.2f \n" %total)
        print("최종점수\t:\t%.2f \n" %total, file=outfile)
        numbers = infile.readline()

    return

def removeMinimum(values, count) :                              # values에서 count만큼 최소값을 삭제하는 함수입니다.
    for i in range(count) :                                     # count만큼 반복하는 for문입니다.
        minNumber = 0  
        try :
            for j in range(len(values)) :                       # 최소값의 인덱스를 찾아내는 for문입니다.
                if values[j] < values[minNumber] :
                    minNumber = j
            values.pop(minNumber)                               # 최소값을 삭제합니다.
        except IndexError:
            continue
    return values

main()